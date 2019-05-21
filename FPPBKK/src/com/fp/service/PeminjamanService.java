package com.fp.service;

import java.util.List;

import com.fp.entity.Peminjaman;

public interface PeminjamanService {
	public List<Peminjaman> getPeminjamans();
    public void savePeminjaman(String barangnama, String usernama, String waktupinjam, String waktukembali);
}
