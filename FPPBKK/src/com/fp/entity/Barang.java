package com.fp.entity;

public class Barang {
	private String name;
	private long id;
	private String harga;
	
	
	public Barang() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Barang(String name, long id, String harga) {
		super();
		this.name = name;
		this.id = id;
		this.harga = harga;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHarga() {
		return harga;
	}
	public void setHarga(String harga) {
		this.harga = harga;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}
