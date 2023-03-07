package com.vti.frontend;

//import java.util.Scanner;

import com.vti.ultis.ScannerUltis;

public class Demo_Ultis {
	public static void main(String[] args) {

		// Scanner scanner = new Scanner(System.in);

		System.out.println("moi ban nhap tuoi: ");

		int age = ScannerUltis.inputInt();

		System.out.println("tuoi vua nhap vao: " + age);

	}
}
