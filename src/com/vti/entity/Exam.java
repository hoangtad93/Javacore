package com.vti.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exam {
	public int examID;
	public int code;
	public String title;
	public Categoryquestion categoryID;
	public LocalDateTime duration;
	public Account creatorID;
	public LocalDate createDate;
}
