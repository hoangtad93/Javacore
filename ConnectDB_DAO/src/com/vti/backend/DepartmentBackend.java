package com.vti.backend;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.DAO.DepartmentDAO;
import com.vti.entity.Department;
import com.vti.ultis.ScannerUltis;

public class DepartmentBackend {
	private DepartmentDAO departmentDAO;

	public DepartmentBackend() throws ClassNotFoundException, IOException {
		super();
		departmentDAO = new DepartmentDAO();
	}

// khai báo hàm hiển thị ds department trên hệ thống
	public void showListDepartment() throws ClassNotFoundException, SQLException {
		List<Department> list = departmentDAO.getListDepartment();

		System.out.println("Thông tin Department đang có trên hệ thống: ");
		String leftAlignFormat = "| %-6d | %-21s |%n";

		System.out.format("+--------+-----------------------+%n");
		System.out.format("|   ID   | DepartmentName          |%n");
		System.out.format("+--------+-----------------------+%n");

		for (Department department : list) {
			System.out.format(leftAlignFormat, department.getId(), department.getName());
		}
		System.out.format("+--------+-----------------------+%n");
	}

	public void showDepartmentByID() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println(" Mời bạn nhập vào id của phòng ban cần tìm:");
		int idFind = ScannerUltis.inputIntPositive();
		Department departmentFind = departmentDAO.getDepartmentByID(idFind);
		System.out.println("Thông tin phòng ban cần tìm là: ");
		String leftAlignFormat = "| %-6d | %-21s |%n";

		System.out.format("+--------+-----------------------+%n");
		System.out.format("|   ID   | DepartmentName        |%n");
		System.out.format("+--------+-----------------------+%n");
		System.out.format(leftAlignFormat, departmentFind.getId(), departmentFind.getName());
		System.out.format("+--------+-----------------------+%n");
	}

	public void showUpdateDepartment() {
		// TODO Auto-generated method stub

	}

}
