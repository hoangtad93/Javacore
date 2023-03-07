package com.vti.frontend;

import java.util.LinkedList;
import java.util.Queue;

import com.vti.entity.Student;

public class Demo_Queue {
	public static void main(String[] args) {
		Student student1 = new Student(1, "trang");
		Student student2 = new Student(2, "vy");
		Student student3 = new Student(3, "phuong");
		Student student4 = new Student(4, "quyen");
		Student student5 = new Student(5, "phong");
		Student student6 = new Student(6, "Hoang");
		Student student7 = new Student(3, "phuong");
		// queue
		Queue<Student> queue = new LinkedList<Student>();
		queue.add(student1);
		queue.add(student2);
		queue.add(student3);
		queue.add(student4);
		queue.add(student5);
		queue.add(student6);
//		System.out.println("-----interator-----");
//		Iterator<Student> interator = queue.iterator();
//		while (interator.hasNext()) {
//			Student student = interator.next();
//			System.out.println(student);
//		}
		// lay du lieu sd poll()
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println("-----------");
		for (Student student : queue) {
			System.out.println(student.toString());
		}

	}
}
