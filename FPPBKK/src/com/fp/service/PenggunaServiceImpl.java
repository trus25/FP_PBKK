package com.fp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fp.dao.PenggunaDAO;
import com.fp.entity.Pengguna;


@Service
public class PenggunaServiceImpl implements PenggunaService {

	@Autowired
	private PenggunaDAO penggunaDAO;
	
	
	@Override
	@Transactional
	public String checkPengguna(Pengguna thePengguna) {
		String result = penggunaDAO.checkPengguna(thePengguna);
		return result;
	}
	
	@Override
	@Transactional
	public int dapatPengguna(Pengguna thePengguna) {
		int result = penggunaDAO.dapatPengguna(thePengguna);
		return result;
	}
}
