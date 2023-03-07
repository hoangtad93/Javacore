package com.vti.entity;

public class Project {
	private int projectId;
	private int teamSize;
	private int idMenager;
	private int idEmployees;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public int getIdMenager() {
		return idMenager;
	}

	public void setIdMenager(int idMenager) {
		this.idMenager = idMenager;
	}

	public int getIdEmployees() {
		return idEmployees;
	}

	public void setIdEmployees(int idEmployees) {
		this.idEmployees = idEmployees;
	}

	public int printProject() {
		return this.projectId + this.teamSize + this.idMenager + this.idEmployees;

	}

}
