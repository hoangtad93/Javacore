package com.vti.entity;

import java.time.LocalDate;

public class Account {
	private int accountId;
	private String email;
	private String username;
	private String fullName;
	private String avatarlmageName;
	private int mobile;
	private String address;
	private LocalDate createDate;
	private String password;
	private String status;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAvatarlmageName() {
		return avatarlmageName;
	}

	public void setAvatarlmageName(String avatarlmageName) {
		this.avatarlmageName = avatarlmageName;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", email=" + email + ", username=" + username + ", fullName="
				+ fullName + ", avatarlmageName=" + avatarlmageName + ", mobile=" + mobile + ", address=" + address
				+ ", createDate=" + createDate + ", password=" + password + ", status=" + status + "]";
	}

}
