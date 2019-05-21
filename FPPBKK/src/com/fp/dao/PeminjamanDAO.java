package com.fp.dao;

import java.util.List;

import com.fp.entity.Peminjaman;;


public interface PeminjamanDAO {
	public List<Peminjaman> getPeminjamans();
	public void savePeminjaman(String barangnama, String usernama, String waktupinjam, String waktukembali);
}
