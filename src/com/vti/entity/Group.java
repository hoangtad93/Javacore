package com.vti.entity;

import java.time.LocalDate;

public class Group {
	public int groupID;
	public String groupName;
	public Account creatorID;
	public LocalDate createDate;
	public Account[] accounts;
}
