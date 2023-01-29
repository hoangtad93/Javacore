package com.vti.fontend;

import java.util.Scanner;

public class demo3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap so nguyen thu nhat: ");
		int a = scanner.nextInt();
		System.out.println("nhap so vua nhap: " + a);
		System.out.println("------------------");
		System.out.println("nhap so nguyen thu 2: ");
		int b = scanner.nextInt();
		System.out.println("nhap so vua nhap: " + b);
		int result = a + b;
		System.out.println("sum: " + a + " & " + b + ": " + result);
	}
}
