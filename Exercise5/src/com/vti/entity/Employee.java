package com.vti.entity;

public class Employee extends Staff {
	private String task;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, Gender gender, String address, String task) {
		super(name, age, gender, address);
		// TODO Auto-generated constructor stub
		this.task = task;

	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

}
