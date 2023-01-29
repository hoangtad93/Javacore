package com.vti.entity;

import java.time.LocalDate;

public class Question {
	public int questionID;
	public String content;
	public Categoryquestion categoryID;
	public Typequestion typeID;
	public Account creatorID;
	public LocalDate createDate;
}
