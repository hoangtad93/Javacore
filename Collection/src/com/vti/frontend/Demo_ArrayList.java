package com.vti.frontend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.vti.entity.Student;
import com.vti.ultis.ScannerUltis;

public class Demo_ArrayList {
	public static void main(String[] args) {
		Student student1 = new Student(1, "trang");
		Student student2 = new Student(2, "vy");
		Student student3 = new Student(3, "phuong");
		Student student4 = new Student(4, "quyen");
		Student student5 = new Student(5, "phong");
		Student student6 = new Student(5, "Hoang");
		Student student7 = new Student(3, "phuong");
		// tao arraylist luu cac hoc vien

		ArrayList<Student> listStudents = new ArrayList<>();
		listStudents.add(student1);
		listStudents.add(student2);
		listStudents.add(student3);
		listStudents.add(student4);
		listStudents.add(student5);
		for (Student student : listStudents) {
			System.out.println(student.toString());
		}

		System.out.println("-----interator-----");
		Iterator<Student> interator = listStudents.iterator();
		while (interator.hasNext()) {
			Student element = interator.next();
			System.out.println(element);
		}
		System.out.println("-----tong so phan tu-----");
		System.out.println(listStudents.size());
		System.out.println("-----ham get lay ra phan tu index bat dau tu 0-----");

		System.out.println(listStudents.get(3));
		System.out.println("-----them sv vao dau danh sach-----");
		listStudents.add(0, student6);
		listStudents.add(3, student7);
		for (Student student : listStudents) {
			System.out.println(student.toString());
		}
		System.out.println("-----dao nguoc danh sach-----");
		Collections.reverse(listStudents);
		for (Student student : listStudents) {
			System.out.println(student.toString());
		}
		System.out.println("-----inputIntPositive tim kiem theo id-----");
		System.out.println("Nhập vào ID cần tìm kiếm:");
		int idFind = ScannerUltis.inputIntPositive();
		for (Student student : listStudents) {
			if (student.getId() == idFind) {
				System.out.println(student);
			}
		}
		System.out.println("Các sinh viên trùng tên: ");
		for (int i = 0; i < listStudents.size(); i++) {
			for (int j = i + 1; j < listStudents.size(); j++) {
				if (listStudents.get(i).getName().equals(listStudents.get(j).getName())) {
					System.out.println(listStudents.get(i).toString());
				}
			}
		}

	}

}
