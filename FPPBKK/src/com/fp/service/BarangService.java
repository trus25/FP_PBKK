package com.fp.service;

import java.util.List;

import com.fp.entity.Barang;

public interface BarangService {
	public List<Barang> getBarangs();

	public Barang getBarang(int theId);

	public void saveBarang(Barang theBarang);

	public void deleteBarang(int theId);
}
