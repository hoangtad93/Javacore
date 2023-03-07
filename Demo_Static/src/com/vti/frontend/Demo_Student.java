package com.vti.frontend;

import com.vti.entity.Student;

public class Demo_Student {
	public static void main(String[] args) {
		Student.className = "vti_raiway63";
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("st1");
		// student1.setClassname("raiway 63");
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("st2");
		// student2.setClassname("raiway 63");
		Student student3 = new Student();
		student3.setId(3);
		student3.setName("st3");
		// student3.setClassname("raiway 63");
		Student student4 = new Student();
		student4.setId(4);
		student4.setName("st4");
		// student4.setClassname("raiway 63");
		System.out.println(" --- thong tin student ---");
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		System.out.println(student4.toString());
		// hoc phan mock 2301
		System.out.println("--- student sau khi chuyen lop---");
		student1.className = "mock2301 vti";
		student2.className = "mock2302";
		System.out.println(student1.toString());
		System.out.println(student2.toString());
	}
}
