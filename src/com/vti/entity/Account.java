package com.vti.entity;

import java.time.LocalDate;

public class Account {
	public int accountID;
	public String email;
	public String userName;
	public String fullName;
	public Department departmentId;
	public Position positionId;
	public LocalDate createDate;
	public Group[] groups;

}
