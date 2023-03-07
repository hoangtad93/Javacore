package com.vti.entity;

public class Employee extends User {
	private Project projectId;
	private String proSkill;

	public String getProSkill() {
		return proSkill;
	}

	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}

	public Project getProjectId() {
		return projectId;
	}

	public void setProjectId(Project projectId) {
		this.projectId = projectId;
	}

	public String printEmployee() {
		printUser();
		return this.proSkill;

	}

}
