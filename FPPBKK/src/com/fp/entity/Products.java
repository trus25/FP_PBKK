package com.fp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="barang")
public class Products {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nama_barang")
	private String barangName;
	
	@Column(name="jenis_barang")
	private String barangCategory;
	
	@Column(name="harga_pinjaman")
	private int barangPrice;
	
	@Column(name="user_id")
	private int barangUserid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBarangName() {
		return barangName;
	}

	public void setBarangName(String productName) {
		this.barangName = productName;
	}

	public String getBarangCategory() {
		return barangCategory;
	}

	public void setBarangCategory(String productPrice) {
		this.barangCategory = productPrice;
	}

	public int getBarangPrice() {
		return barangPrice;
	}

	public void setBarangPrice(int productCondition) {
		this.barangPrice = productCondition;
	}

	public int getBarangUserid() {
		return barangUserid;
	}

	public void setBarangUserid(int productGuarantee) {
		this.barangUserid = productGuarantee;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", barangName=" + barangName + ", barangCategory=" + barangCategory
				+ ", barangPrice=" + barangPrice + ", barangUserid=" + barangUserid + "]";
	}

	
	
	
}
