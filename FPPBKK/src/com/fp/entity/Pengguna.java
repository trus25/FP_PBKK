package com.fp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pengguna")
public class Pengguna {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int penggunaId;
	
	@Column(name="username")
	private String penggunaUsername;
	
	@Column(name="email")
	private String penggunaEmail;
	
	@Column(name="password")
	private String penggunaPassword;

	public int getPenggunaId() {
		return penggunaId;
	}

	public void setPenggunaId(int penggunaId) {
		this.penggunaId = penggunaId;
	}

	public String getPenggunaUsername() {
		return penggunaUsername;
	}

	public void setPenggunaUsername(String penggunaUsername) {
		this.penggunaUsername = penggunaUsername;
	}

	public String getPenggunaEmail() {
		return penggunaEmail;
	}

	public void setPenggunaEmail(String penggunaEmail) {
		this.penggunaEmail = penggunaEmail;
	}

	public String getPenggunaPassword() {
		return penggunaPassword;
	}

	public void setPenggunaPassword(String penggunaPassword) {
		this.penggunaPassword = penggunaPassword;
	}

	@Override
	public String toString() {
		return "Pengguna [penggunaId=" + penggunaId + ", penggunaUsername=" + penggunaUsername + ", penggunaEmail="
				+ penggunaEmail + ", penggunaPassword=" + penggunaPassword + "]";
	}
	
	
}

