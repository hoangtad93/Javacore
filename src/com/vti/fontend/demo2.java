package com.vti.fontend;

public class demo2 {
//        if esle
	public static void main(String[] args) {
		// int a = 10;
		/*
		 * if (a == 1) { System.out.println("ban vua nhap vao so 1"); } else {
		 * System.out.println("ban vua nhap vao so k phai 1 ma la so: " + a); }
		 * 
		 * // toan tu tenar System.out.println(a == 1 ? "ban vua nhap vao so 1" :
		 * "ban vua nhap vao so: " + a);
		 * 
		 * // switch case switch (a) { case 1:
		 * tem.out.println("ban vua nhap vao so 1"); break; case 2:
		 * System.out.println("ban vua nhap vao so 2"); break; case 3:
		 * System.out.println("ban vua nhap vao so 3"); break; case 4:
		 * System.out.println("ban vua nhap vao so 4"); break;
		 * 
		 * default: System.out.println("ban vua nhap vao so k phai 1 ma la so: " + a);
		 * break; }
		 */

		// for

		System.out.println("-------------for-------------");
		String[] hs = { "hoang", "tien", "trang" };
		for (int i = 0; i < hs.length; ++i) {
			System.out.println(hs[i]);

		}
		// for each

		System.out.println("-------------for each-------------"); // mỗi lần lặp sẽ lấy ra được một phần tử
		for (String nameStudent : hs) {
			System.out.println(nameStudent);

		}

		// while
		System.out.println("-------------while-------------"); // dieu kien luon dung vong lap se luon chay
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i = i + 1;
		}
		System.out.println("-------------do while-------------"); // in ra it nhat 1 lan
		int k = 100;
		do {
			System.out.println(k);
			k++;
		} while (k <= 10); // k= 101 <= 10 false dung vong loop va k in ra 101

		// break
		System.out.println("-------------break-------------"); // in ra it nhat 1 lan
		for (int j = 0; j <= 10; j++) {
			if (j == 3) {
				// break;
				continue;// thoát khỏi lần lặp hiện tại
			}
			System.out.println(j);
		}
	}
}
