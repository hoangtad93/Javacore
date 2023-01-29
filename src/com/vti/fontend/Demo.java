package com.vti.fontend;

public class Demo {
	public static void main(String[] args) {
		// array mảng dữ liệu tương đồng kiểu
		// cach 1
		String[] nameRailway63s = new String[4];
		nameRailway63s[0] = "chinh";
		nameRailway63s[1] = "nam";
		nameRailway63s[2] = "cong";
		nameRailway63s[3] = "hong";
// lay du lieu
		System.out.println("phan tu 1: " + nameRailway63s[0]);
		System.out.println("phan tu 2: " + nameRailway63s[1]);
		System.out.println("phan tu 3: " + nameRailway63s[2]);
		System.out.println("phan tu 4: " + nameRailway63s[3]);

		// cach 2
		System.out.println("---------------------------------- ");
		String[] nameRailway63s_2 = { "chinh", "phuong", "nam" };
		System.out.println("phan tu 1: " + nameRailway63s_2[0]);
		System.out.println("phan tu 2: " + nameRailway63s_2[1]);
		System.out.println("phan tu 3: " + nameRailway63s_2[2]);
	}
}
