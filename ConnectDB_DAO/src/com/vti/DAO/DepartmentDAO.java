package com.vti.DAO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Department;
import com.vti.ultis.jdbcUltis;

public class DepartmentDAO {
// hàm lấy danh sach phòng ban từ DB
	private jdbcUltis jdbc;

	public DepartmentDAO() throws FileNotFoundException, IOException {

		// TODO Auto-generated constructor stub
		super();
		jdbc = new jdbcUltis();
	}

	public List<Department> getListDepartment() throws ClassNotFoundException, SQLException {
		String sqlSelectDepartment = "SELECT * FROM Department ORDER BY DepartmentID";
		ResultSet resultSetDepartment = jdbc.executeQuery(sqlSelectDepartment);

		List<Department> listDepartments = new ArrayList();
		while (resultSetDepartment.next()) {
			Department department = new Department();
			department.setId(resultSetDepartment.getInt(1));
			department.setName(resultSetDepartment.getString(2));
			listDepartments.add(department);
		}
		return listDepartments;
	}

// hàm lấy phòng ban theo ID
	public Department getDepartmentByID(int idFind) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String sqlSelect = "SELECT * FROM Department WHERE DepartmentID = ?";
		PreparedStatement preparedStatement = jdbc.createPrepareStatement(sqlSelect);
		preparedStatement.setInt(1, idFind);

		ResultSet resultSetDepartmentById = preparedStatement.executeQuery();
		if (resultSetDepartmentById.next()) {
			Department department = new Department();
			department.setId(resultSetDepartmentById.getInt(1));
			department.setName(resultSetDepartmentById.getString(2));
			jdbc.disConnection(); // mở ra xong thì phải đóng lại
			return department;
		} else {
			jdbc.disConnection();
			return null;
		}
	}
}
