package com.vti.frontend;

import com.vti.entity.Department;

public class Demo_Department {
	public static void main(String[] args) {
		// tạo ra các phòng ban
		// Class tên_biến = new
		Department department1 = new Department();
		department1.ID = 1;
		department1.Name = "sale";

		// in thongtin dep1
		System.out.println("tt phong ban 1 ");
		System.out.println("ID: " + department1.ID);
		System.out.println("Name:" + department1.Name);

		// create dep2
		Department department2 = new Department();
		department2.ID = 2;
		department2.Name = "Marketing";

		// in thongtin dep2
		System.out.println("tt phong ban 2 ");
		System.out.println("ID: " + department2.ID);
		System.out.println("Name:" + department2.Name);
		// create dep2
		Department department3 = new Department(3, "BOD");
		department3.toPrintDepartment();
		System.out.println("thong tin phong 2: " + department2.toPrintDepartment2());
	}
}
