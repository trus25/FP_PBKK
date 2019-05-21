package com.fp.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fp.entity.Peminjaman;
import com.fp.entity.Pengguna;
import com.fp.entity.Products;

@Repository
public class PeminjamanDAOImpl implements PeminjamanDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Peminjaman> getPeminjamans() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Peminjaman> theQuery = currentSession.createQuery("from Peminjaman order by id_pinjaman", Peminjaman.class);
		
		List<Peminjaman> peminjaman = theQuery.getResultList();
		
		return peminjaman;
	}
	
	@Override
	public void savePeminjaman(String barangnama, String usernama, String waktupinjam, String waktukembali) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query query = currentSession.createSQLQuery(
				"CALL updateharga(:namabarang,:namauser,:waktupinjam,:waktukembali)")
				.addEntity(Peminjaman.class)
				.setParameter("namabarang", barangnama)
				.setParameter("namauser", usernama)
				.setParameter("waktupinjam", waktupinjam)
				.setParameter("waktukembali", waktukembali);
		
		
	}

}
