package com.vti.frontend;

import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.DepartmentBackend;

public class Demo_Department {
	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {

		DepartmentBackend departmentBackend = new DepartmentBackend();
		// departmentBackend.showListDepartment();
		departmentBackend.showDepartmentByID();
		departmentBackend.showUpdateDepartment();
	}
}
