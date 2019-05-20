package com.fp.config;

import java.util.Properties;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class HibernateConfig
{

@Bean
public LocalSessionFactoryBean sessionFactory()
{
    LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
    sessionFactory.setDataSource(dataSource());
    sessionFactory.setPackagesToScan("com.crmproject.entity");
    sessionFactory.setHibernateProperties(hibernateProperties());

    return sessionFactory;
}

@Bean
public DataSource dataSource()
{
	 DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    dataSource.setUrl("jdbc:mysql://localhost:3306/fppbkk?serverTimezone=UTC&amp;useSSL=false");
    dataSource.setUsername("fpuser");
    dataSource.setPassword("admin");

    return dataSource;
}

private final Properties hibernateProperties()
{
    Properties hibernateProperties = new Properties();
    hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
    hibernateProperties.setProperty("hibernate.show_sql", "true");

    return hibernateProperties;
}

}