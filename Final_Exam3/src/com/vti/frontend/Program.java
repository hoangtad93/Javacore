package com.vti.frontend;

import java.util.Scanner;

import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.Project;
import com.vti.entity.User;

public class Program {
	public static void main(String[] args) {

		// tao user
		User user1 = new User();
		user1.setId(1);
		user1.setFullName("Ta Hoang");
		user1.setEmail("hoangta@gmail.com");
		user1.setPassWord("hoang12300");
		User user2 = new User();
		user2.setId(2);
		user2.setFullName("Thuy Tien");
		user2.setEmail("thuytien@gmail.com");
		user2.setPassWord("tien345601");

		// tao project

		Project project1 = new Project();
		project1.setProjectId(01);
		project1.setTeamSize(10);
		project1.setIdMenager(001);
		project1.setIdEmployees(10);
		Project project2 = new Project();
		project2.setProjectId(02);
		project2.setTeamSize(20);
		project2.setIdMenager(002);
		project2.setIdEmployees(20);

		// tao Manager
		Manager manager1 = new Manager();
		manager1.setExpInYear(2);
		Manager manager2 = new Manager();
		manager2.setExpInYear(10);

		// tao Employee
		Employee employee1 = new Employee();
		employee1.setProjectId(project2);
		employee1.setProSkill("dev, java");
		Employee employee2 = new Employee();
		employee1.setProjectId(project1);
		employee2.setProSkill("Test, sql");

		System.out.println("---------------------q2---------");

		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao ten project: ");
		int p = scanner.nextInt();
		if (p == project1.getProjectId()) {
			System.out.println("Employee & manager co trong project: " + project1.getProjectId() + " la: "
					+ employee2.printEmployee() + " manager: " + manager1.printManager());
		} else {
			System.out.println("null!");
		}
	}

}
