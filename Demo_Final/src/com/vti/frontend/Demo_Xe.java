package com.vti.frontend;

import com.vti.entity.Xe;

public class Demo_Xe {
	public static void main(String[] args) {
		Xe xemay = new Xe(80);
		xemay.setId(1);
		xemay.setName("Wave");
		// xemay.setMaxSpeed(80);// xuat xuong : 80km/h

		System.out.println(xemay.toString());
		System.out.println("---------------------");

//		xemay.setMaxSpeed(120); // khong ddung neu dung vs final

		Xe oto = new Xe(160);
		oto.setId(2);
		oto.setName("BMW");
		System.out.println(oto.toString());

	}
}
