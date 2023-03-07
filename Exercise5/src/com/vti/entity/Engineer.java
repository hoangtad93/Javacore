package com.vti.entity;

public class Engineer extends Staff {
	private String specialized;

	public Engineer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engineer(String name, int age, Gender gender, String address, String specialized) {
		super(name, age, gender, address);
		// TODO Auto-generated constructor stub
		this.setSpecialized(specialized);
	}

	public String getSpecialized() {
		return specialized;
	}

	public void setSpecialized(String specialized) {
		this.specialized = specialized;
	}

}
