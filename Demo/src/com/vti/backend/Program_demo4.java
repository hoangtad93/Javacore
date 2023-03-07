package com.vti.backend;

public class Program_demo4 {
	public int divice(int a, int b) throws Exception {
		// c1
//		try {
//			int resultDivice = a / b;
//			return resultDivice;
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("phep chia khong hop le!");
//		}
//		return 0;

		// c2
		// int resultDivice = a / b;
		// return resultDivice;

		// c3
		try {
			int resultDivice = a / b;
			return resultDivice;

		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception(); // quăng ra thông báo để lập trình viên biết mà try catch
		}

	}
}
