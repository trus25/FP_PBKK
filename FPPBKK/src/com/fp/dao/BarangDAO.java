package com.fp.dao;

import java.util.List;

import com.fp.entity.Barang;

public interface BarangDAO {
	public List<Barang> getBarangs();

	public Barang getBarang(int theId);

	public void saveBarang(Barang theBarang);

	public void deleteBarang(int theId);
}
