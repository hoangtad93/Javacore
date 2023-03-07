package com.vti.entity;

public class Worker extends Staff {
	private int rank;

	// contructor khong tham so
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	// contructor co tham so

	public Worker(String name, int age, Gender gender, String adderess, int rank) {
		super(name, age, gender, adderess);
		this.rank = rank;
		// TODO Auto-generated constructor stub
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}
}
