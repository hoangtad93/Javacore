package com.vti.frontend;

import com.vti.entity.Account;

public class Demo_Account {
	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.setId(1);
		acc1.setEmail("hoangtad93@gmail.com");
		acc1.setUsername("hoangta");
		acc1.setFullname("tahoang");
		System.out.println("thong tin acc1: " + " ID: " + acc1.getId() + " | Email: " + acc1.getEmail()
				+ " | userName: " + acc1.getUsername() + " | fullname: " + acc1.getFullname());
	}

}
