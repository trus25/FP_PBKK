package com.fp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fp.entity.Pengguna;

@Repository
public class PenggunaDAOImpl implements PenggunaDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public String checkPengguna(Pengguna thePengguna) {
		Session currentSession = sessionFactory.getCurrentSession();
		String user = thePengguna.getPenggunaUsername();
		String pass = thePengguna.getPenggunaPassword();
		Query<Pengguna> theQuery = currentSession.createQuery("from Pengguna where pengguna_nama=:username and pengguna_password=:password",Pengguna.class);
		theQuery.setParameter("username", user);
		theQuery.setParameter("password", pass);
		Pengguna tempPengguna = theQuery.getSingleResult();
		if (user.equals(tempPengguna.getPenggunaUsername())) {
			return "accepted";
		}
		else return "refused";
	}

}
