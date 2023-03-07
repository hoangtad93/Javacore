package com.vti.entity;

public class Mentor extends Staff {
	private int yearsOfExperience;

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String printYearOfExperience() {
		return " , YearsOfExperience: " + this.yearsOfExperience;

	}

}
