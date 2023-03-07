package com.vti.backend;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.vti.entity.Employee;
import com.vti.entity.Engineer;
import com.vti.entity.Gender;
import com.vti.entity.Staff;
import com.vti.entity.Worker;

public class ExerciseBackend {
	private Scanner scanner = new Scanner(System.in);
	// khai vao mang dong
	private ArrayList<Staff> staffList = new ArrayList<>();
	// private ArrayList<Worker> workerList = new ArrayList<>();
	// private ArrayList<Engineer> engineerList = new ArrayList<>();
	// private ArrayList<Employee> employeeList = new ArrayList<>();

	// them moi nhan vien addStaff()
	public void addStaff() {
		System.out.println("+------------------------Bạn muốn thêm đối tượng -------------------+");
		System.out.printf("|%-49s|%n", "1. Thêm Worker");
		System.out.printf("|%-49s|%n", "2. Thêm Enggineer");
		System.out.printf("|%-49s|%n", "3. Thêm Employee");
		System.out.println("+-------------------------------------------------+");
		int chooseMenu = scanner.nextInt();

		switch (chooseMenu) {
		case 1:
			System.out.println("Thêm Worker");
			System.out.println("Nhap vao ten Worker: ");
			String nameInput = scanner.next();
			System.out.println("Nhap vao tuoi Worker: ");
			int ageInput = scanner.nextInt();

			System.out.println("chon gioi tinh Worker: 1.Male, 2.Female, 3.Unknown: ");
			int chooseGender = scanner.nextInt();
			Gender genderInput = null;
			switch (chooseGender) {
			case 1:
				genderInput = Gender.MALE;
				break;
			case 2:
				genderInput = Gender.FEMALE;
				break;
			case 3:
				genderInput = Gender.UNKNOWN;
				break;
			}
			System.out.println("Nhap vao dia chi Worker: ");
			String addreessInput = scanner.next();
			System.out.println("Nhap vao bac Worker: ");
			int rankInput = scanner.nextInt();

			Worker worker = new Worker();// tao ra mot doi tuong trong
			worker.setName(nameInput);
			worker.setAge(ageInput);
			worker.setGender(genderInput);
			worker.setAddress(addreessInput);
			worker.setRank(rankInput);

			staffList.add(worker); // them worker vao list
			break;
		case 2:
			System.out.println("Thêm Enggineer");
			System.out.println("Nhap vao ten Engginee: ");
			String nameInputE = scanner.next();
			System.out.println("Nhap vao tuoi Engginee: ");
			int ageInputE = scanner.nextInt();

			System.out.println("chon gioi tinh Engginee: 1.Male, 2.Female, 3.Unknown: ");
			int chooseGenderE = scanner.nextInt();
			Gender genderInputE = null;
			switch (chooseGenderE) {
			case 1:
				genderInput = Gender.MALE;
				break;
			case 2:
				genderInput = Gender.FEMALE;
				break;
			case 3:
				genderInput = Gender.UNKNOWN;
				break;
			}
			System.out.println("Nhap vao dia chi Engginee: ");
			String addreessInputE = scanner.next();
			System.out.println("Nhap vao specialized Engginee: ");
			String specializedInput = scanner.next();

			Engineer engineer = new Engineer();// tao ra mot doi tuong trong
			engineer.setName(nameInputE);
			engineer.setAge(ageInputE);
			engineer.setGender(genderInputE);
			engineer.setAddress(addreessInputE);
			engineer.setSpecialized(specializedInput);

			staffList.add(engineer); // them worker vao list
			break;
		case 3:
			System.out.println("Thêm Employee");
			System.out.println("Nhap vao ten Employee: ");
			String nameInputEp = scanner.next();
			System.out.println("Nhap vao tuoi Employee: ");
			int ageInputEp = scanner.nextInt();

			System.out.println("chon gioi tinh Employee: 1.Male, 2.Female, 3.Unknown: ");
			int chooseGenderEp = scanner.nextInt();
			Gender genderInputEp = null;
			switch (chooseGenderEp) {
			case 1:
				genderInput = Gender.MALE;
				break;
			case 2:
				genderInput = Gender.FEMALE;
				break;
			case 3:
				genderInput = Gender.UNKNOWN;
				break;
			}
			System.out.println("Nhap vao dia chi Engginee: ");
			String addreessInputEp = scanner.next();
			System.out.println("Nhap vao specialized Engginee: ");
			String taskInput = scanner.next();

			Employee employee = new Employee();// tao ra mot doi tuong trong
			employee.setName(nameInputEp);
			employee.setAge(ageInputEp);
			employee.setGender(genderInputEp);
			employee.setAddress(addreessInputEp);
			employee.setTask(taskInput);

			staffList.add(employee); // them worker vao list
			break;
		}

	}

	// tim kiem theo ten findByName()
	public void findByName() {
		System.out.println("tim kiem nhan vien");
		System.out.println("nhap vao ten cua nhan vien can tim kiem");
		String nameFind = scanner.next();
		for (Staff staff : staffList) {
			if (staff.getName().equals(nameFind)) {
				// System.out.println(staff.toString());
				printListStaff();

			}
		}
	}

	// phuong thuc hien thi danh sach nhan vien printListStraff()
	public void printListStaff() {
		System.out.println("hien thi danh sach nhan vien");
		Iterator<Staff> iterator = staffList.iterator();
		// hasNext() neu con phan tu thi tra ve true
		while (iterator.hasNext()) {
			Staff staff = iterator.next(); // tra ve 1 ptu trong mang
			System.out.println(staff.toString());
		}

		/*
		 * if (staffList == null) { System.out.println("chua co worker"); } else {
		 * System.out.println("danh sach worker"); for (Worker worker : staffList) {
		 * System.out.println(worker.toString() + "rank " + worker.getRank()); } }
		 * 
		 * 
		 * System.out.println("------------------------");
		 * System.out.println("hien thi danh sach engineer"); for (Engineer engineer :
		 * staffList) { System.out.println(engineer.toString() + " Specialized " +
		 * engineer.getSpecialized()); } System.out.println("------------------------");
		 * 
		 * System.out.println("hien thi danh sach employee"); for (Employee employee :
		 * staffList) { System.out.println(employee.toString() + " Specialized " +
		 * employee.getTask()); }
		 */
	}

	// phuong thuc xoa nhan vien deleteByName()
	public void deleteByName() {
		System.out.println("xoa nhan vien");
		System.out.println("nhap vao ten cua nhan vien can xoa");
		String nameDelete = scanner.next();
		Iterator<Staff> iterator = staffList.iterator();
		while (iterator.hasNext()) {
			Staff staff = iterator.next();// tra ve 1 phan tu
			if (staff.getName().equals(nameDelete)) {
				iterator.remove();

			}
		}

	}
}
