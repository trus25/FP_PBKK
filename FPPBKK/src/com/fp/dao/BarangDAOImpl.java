package com.fp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fp.entity.Barang;

@Repository
public class BarangDAOImpl implements BarangDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Barang> getBarangs() {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query
		Query<Barang> theQuery = currentSession.createQuery("from Barang order by id", Barang.class);

		// execute query and get result list
		List<Barang> barang = theQuery.getResultList();

		// return the results
		return barang;

	}

	@Override
	public Barang getBarang(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Barang theBarang = currentSession.get(Barang.class, theId);
		
		return theBarang;
	}

	@Override
	public void saveBarang(Barang theBarang) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theBarang);
		
	}

	@Override
	public void deleteBarang(int theId) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from Barang where id=:Idbarang");
		
		theQuery.setParameter("Idbarang", theId);
		
		theQuery.executeUpdate();
		
	}

}
