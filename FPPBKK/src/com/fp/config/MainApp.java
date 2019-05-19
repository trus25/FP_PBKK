package com.fp.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.fp.entity.Barang;

public class MainApp {

	public static void main(String[] args) {
		// Create Session Factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Barang.class)
				.buildSessionFactory();

		// Begin Transaction
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		// Create object
		Barang course = new Barang("barang");
		
		// Save object to database 
		session.save(course);
		
		// Commit transaction
		session.getTransaction().commit();
		System.out.println("Committing transaction.");
		
		// Close transaction
		session.close();
		System.out.println("Session closed.");

	}

}