package com.vti.frontend;

import java.util.Stack;

import com.vti.entity.Student;

public class Demo_Stack {
	public static void main(String[] args) {
		Student student1 = new Student(1, "trang");
		Student student2 = new Student(2, "vy");
		Student student3 = new Student(3, "phuong");
		Student student4 = new Student(4, "quyen");
		Student student5 = new Student(5, "phong");
		Student student6 = new Student(5, "Hoang");
		Student student7 = new Student(3, "phuong");
		// stack

		Stack<Student> studentStack = new Stack<>();
		studentStack.push(student1);
		studentStack.push(student1);
		studentStack.push(student3);
		studentStack.push(student2);
		studentStack.push(student4);
		studentStack.push(student5);
//		System.out.println("-----interator-----");
//		Iterator<Student> interator = studentStack.iterator();
//		while (interator.hasNext()) {
//			Student student = interator.next();
//			System.out.println(student);
//		}
		System.out.println("------print------");
		System.out.println(studentStack.pop());
		System.out.println(studentStack.pop());
		System.out.println(studentStack.pop());
		System.out.println("------");
		for (Student student : studentStack) {
			System.out.println(student.toString());
		}
	}
}
