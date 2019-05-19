package com.fp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="peminjaman")
public class Peminjaman {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pinjaman")
	private int pinjamIdpinjaman;
	
	@Column(name="id_user")
	private int pinjamIduser;
	
	@Column(name="id_barang")
	private int pinjamIdbarang;
	
	@Column(name="waktu_pinjam")
	private String pinjamWaktupinjam;
	
	@Column(name="waktu_kembali")
	private String pinjamWaktukembali;
	
	@Column(name="total_harga")
	private int pinjamHarga;

	public int getPinjamIdpinjaman() {
		return pinjamIdpinjaman;
	}

	public void setPinjamIdpinjaman(int pinjamIdpinjaman) {
		this.pinjamIdpinjaman = pinjamIdpinjaman;
	}

	public int getPinjamIduser() {
		return pinjamIduser;
	}

	public void setPinjamIduser(int pinjamIduser) {
		this.pinjamIduser = pinjamIduser;
	}

	public int getPinjamIdbarang() {
		return pinjamIdbarang;
	}

	public void setPinjamIdbarang(int pinjamIdbarang) {
		this.pinjamIdbarang = pinjamIdbarang;
	}

	public String getPinjamWaktupinjam() {
		return pinjamWaktupinjam;
	}

	public void setPinjamWaktupinjam(String pinjamWaktupinjam) {
		this.pinjamWaktupinjam = pinjamWaktupinjam;
	}

	public String getPinjamWaktukembali() {
		return pinjamWaktukembali;
	}

	public void setPinjamWaktukembali(String pinjamWaktukembali) {
		this.pinjamWaktukembali = pinjamWaktukembali;
	}

	public int getPinjamHarga() {
		return pinjamHarga;
	}

	public void setPinjamHarga(int pinjamHarga) {
		this.pinjamHarga = pinjamHarga;
	}

	@Override
	public String toString() {
		return "Peminjaman [pinjamIdpinjaman=" + pinjamIdpinjaman + ", pinjamIduser=" + pinjamIduser
				+ ", pinjamIdbarang=" + pinjamIdbarang + ", pinjamWaktupinjam=" + pinjamWaktupinjam
				+ ", pinjamWaktukembali=" + pinjamWaktukembali + ", pinjamHarga=" + pinjamHarga + "]";
	}

		
	
	
}
