package com.fp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fp.dao.BarangDAO;
import com.fp.entity.Barang;

@Service
public class BarangServiceImpl implements BarangService {
	
	@Autowired
	private BarangDAO barangDAO;
	
	@Override
	@Transactional
	public List<Barang> getBarangs() {
		return barangDAO.getBarangs();
	}

	@Override
	@Transactional
	public Barang getBarang(int theId) {
		return barangDAO.getBarang(theId);
	}

	@Override
	@Transactional
	public void saveBarang(Barang theBarang) {
		barangDAO.saveBarang(theBarang);
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void deleteBarang(int theId) {
		// TODO Auto-generated method stub
		barangDAO.deleteBarang(theId);
	}

}
