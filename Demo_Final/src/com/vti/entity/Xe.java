package com.vti.entity;

public class Xe {
	private int id;
	private String name;
	private final int maxSpeed;

	private static final int count = 10; // khai bao hang so

// ham contructor co tham so
	public Xe(int maxSpeed) {
		super();
		this.maxSpeed = maxSpeed;
	}

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

	public int getMaxSpeed() {
		return maxSpeed;
	}
// vo nghia neu dung private final

//	public void setMaxSpeed(int maxSpeed) {
//		this.maxSpeed = maxSpeed;
//	}
	// khai bao method chay
	public final void chay() {
		System.out.println("xe co the chay");
	}

	@Override
	public String toString() {
		return "Xe [id=" + id + ", name=" + name + ", maxSpeed=" + maxSpeed + "]";
	}

}
