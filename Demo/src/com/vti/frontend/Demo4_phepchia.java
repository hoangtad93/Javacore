package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.Program_demo4;

public class Demo4_phepchia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" moi ban nhap so thu 1:");
		int aInput = scanner.nextInt();
		System.out.println("moi ban nhap vao so thu 2:");
		int bInput = scanner.nextInt();

		Program_demo4 program_demo4 = new Program_demo4();
		// c2
		// int result = program_demo4.divice(aInput, bInput);

		// c1

		int result = 0;
		try {
			result = program_demo4.divice(aInput, bInput);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("phep chia khong hop le!");
		}
		System.out.println("kq phep chia 2 so tren la : " + result);

	}
}
