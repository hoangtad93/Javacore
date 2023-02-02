package com.vti.frontend;

import com.vti.entity.Mentor;
import com.vti.entity.Student;

public class Demo_Staff {
	public static void main(String[] args) {
		// tao mentor
		Mentor mentor1 = new Mentor();
		mentor1.setId(1);
		mentor1.setName("hoangta");
		mentor1.setGender("male");
		mentor1.setYearsOfExperience(10);
		System.out.println("thong tin mentor: " + " ID: " + mentor1.getId() + " | Name: " + mentor1.getName()
				+ " | Gender: " + mentor1.getGender() + " | YearsOfExperience: " + mentor1.getYearsOfExperience());
		System.out.println("----------------------------------------------------------- ");
		// tao Student
		Student student1 = new Student();
		student1.setId(01);
		student1.setName("Thuy Tien");
		student1.setGender("Female");
		student1.setJob("Developer");
		System.out.println("thong tin Student: " + " ID: " + student1.getId() + " | Name: " + student1.getName()
				+ " | Gender: " + student1.getGender() + " | Job: " + student1.getJob());
		System.out.println("----------------------------------------------------------- ");
		// in tt
		System.out.println("thong tin Student 1: ");
		System.out.println(student1.printInfoCommon() + " , Job:" + student1.getJob());
		System.out.println("----------------------------------------------------------- ");
		// in mentor
		System.out.println("thong tin mentor: ");
		System.out.println(mentor1.printInfoCommon() + mentor1.printYearOfExperience());

	}
}
