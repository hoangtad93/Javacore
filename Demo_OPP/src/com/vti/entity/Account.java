package com.vti.entity;

public class Account {
	private int id;
	private String email;
	private String username;
	private String fullname;

	// ham get lấy du lieu thuoc tinh
	public int getId() {
		return this.id;
	}

	// set dua du lieu vao
	public void setId(int idInput) {
		this.id = idInput;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String emailInput) {
		this.email = emailInput;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String usernameInput) {
		this.username = usernameInput;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullnameInput) {
		this.fullname = fullnameInput;
	}
}
