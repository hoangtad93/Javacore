package com.vti.entity;

public class Student {
	private int id;
	private String name;
	public static String className; // thuoc tinh chung cho tat ca class

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", classname=" + className + "]";
	}
}
