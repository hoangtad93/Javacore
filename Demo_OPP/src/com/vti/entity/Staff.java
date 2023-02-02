package com.vti.entity;

// supper class
public class Staff {
	private int id;
	private String name;
	private String gender;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String printInfoCommon() {
		return "ID: " + this.id + " , Name: " + this.name + " , Gender: " + this.gender;
	}

}
