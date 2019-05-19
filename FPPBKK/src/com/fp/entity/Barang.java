package com.fp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="barang")
public class Barang {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nama_barang")
	private String namaBarang;
	
	@Column(name="jenis_barang")
	private String jenisBarang;
	
	@Column(name="harga_pinjaman")
	private int hargaPinjaman;
	
	@Column(name="user_id")
	private int idUser;
	
	public Barang(String namaBarang) {
		this.namaBarang = namaBarang;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}

	public String getJenisBarang() {
		return jenisBarang;
	}

	public void setJenisBarang(String jenisBarang) {
		this.jenisBarang = jenisBarang;
	}

	public int getHargaPinjaman() {
		return hargaPinjaman;
	}

	public void setHargaPinjaman(int hargaPinjaman) {
		this.hargaPinjaman = hargaPinjaman;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	@Override
	public String toString() {
		return "Barang [id=" + id + ", namaBarang=" + namaBarang + ", jenisBarang=" + jenisBarang + ", hargaPinjaman="
				+ hargaPinjaman + ", idUser=" + idUser + "]";
	}
	
	
	
}
