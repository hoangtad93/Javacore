package com.vti.frontend;

import com.vti.entity.Caculator;

public class Demo_caculator {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		Caculator cal = new Caculator();
		int sumresult = cal.sum(x, y);
		System.out.println("tong la: " + sumresult);
	}
}
