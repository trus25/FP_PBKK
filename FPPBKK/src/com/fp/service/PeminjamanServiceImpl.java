package com.fp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fp.dao.PeminjamanDAO;
import com.fp.entity.Peminjaman;

@Service
public class PeminjamanServiceImpl implements PeminjamanService {
	
	@Autowired
	private PeminjamanDAO peminjamanDAO;
	
	@Override
	@Transactional
	public List<Peminjaman> getPeminjamans(){
		return peminjamanDAO.getPeminjamans();
	}
	
	public void savePeminjaman(String barangnama, String usernama, String waktupinjam, String waktukembali) {
		peminjamanDAO.savePeminjaman(barangnama, usernama, waktupinjam, waktukembali);
	}

}
