package com.vti.entity;

public class Student extends Staff {
	private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job; // this --- gọi lại thuộc tính hiện tại của
		// super ---gọi lại contructor của lớp cha gần nhất.
	}

	public String printInfoStudent() {
		return job;
	}
}
