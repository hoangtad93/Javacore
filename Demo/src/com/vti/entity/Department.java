package com.vti.entity;

public class Department {
	public int ID;
	public String Name;

	// contructor === > hàm khởi tạo
	// hàm tạo không tham số sẽ được java hỗ trợ mặc định
	// khi đã khai báo ra hàm tạo có tham số thì hàm tạo không có tham số sẽ không
	// sử dụng và tự động mất đi. khi muốn dùng thì phải khai báo tường minh
	// hàm tạo không tham số
// alt+shift +s

	public Department() {

	}

	public Department(int iD, String name) {
		super();
		this.ID = iD;
		this.Name = name;
	}

	// hàm tạo có tham
	public Department(int idParam) {
		this.ID = idParam;
	}

	// hàm bình thường
	public void abc() {

	}

	// phuong thuc in
	public void toPrintDepartment() {

		System.out.println("tt phòng ban la: " + "ID: " + this.ID + ", Name:" + this.Name);

	}

	public String toPrintDepartment2() {
		return "id: " + this.ID + ", name: " + this.Name;

	}

}
