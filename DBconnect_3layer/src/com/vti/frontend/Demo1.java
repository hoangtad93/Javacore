package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.ultis.ScannerUltis;

public class Demo1 {
	public static void main(String[] args) throws Exception {

		while (true) {
			String leftAlignFormat = "| %-72s |%n";
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|                        MỜI BẠN CHỌN CHỨC NĂNG                            |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "1. Quản lý nhân viên.");
			System.out.format(leftAlignFormat, "2. Quản lý phòng ban.");
			System.out.format(leftAlignFormat, "3. Quản lý vị trí.");
			System.out.format(leftAlignFormat, "4. Thoát chương trình.");
			switch (ScannerUltis.inputIntPositive()) {
			case 1:
				getMenuAccount();
				break;
			case 2:
				getMenuDepartment();
				break;
			case 3:
				getMenuPossition();
				break;
			case 4:
				return;
			default:
				System.out.println("Nhập lại:");
				break;
			}
		}
	}

	private static void getMenuPossition()
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		while (true) {
			String leftAlignFormat = "| %-72s |%n";
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|                        MỜI BẠN CHỌN CHỨC NĂNG                            |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "1. Hiển thị danh sách possition");
			System.out.format(leftAlignFormat, "2. Tìm possition by id");
			System.out.format(leftAlignFormat, "3. Exit");
			System.out.format("+--------------------------------------------------------------------------+%n");
			switch (ScannerUltis.inputIntPositive()) {
			case 1:
				PossitionFunciton.getListPossition();
				break;
			case 2:
				PossitionFunciton.getPossitonByID();
				;
				break;
			case 3:
				return;
			default:
				System.out.println("Nhập lại:");
				break;
			}
		}

	}

	private static void getMenuDepartment()
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		while (true) {
			String leftAlignFormat = "| %-72s |%n";
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|                   MỜI BẠN CHỌN CHỨC NĂNG                                 |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "1. Hiển thị danh sách department");
			System.out.format(leftAlignFormat, "2. Find department by id");
			System.out.format(leftAlignFormat, "3. Kiểm tra xem Department tồn tại");
			System.out.format(leftAlignFormat, "4. Tạo department mới");
			System.out.format(leftAlignFormat, "5. Cập nhật department");
			System.out.format(leftAlignFormat, "6. Xoá department theo ID");
			System.out.format(leftAlignFormat, "7. Exit");
			System.out.format("+--------------------------------------------------------------------------+%n");
			switch (ScannerUltis.inputIntPositive()) {
			case 1:
				DepartmentFunction.getListDepartment();
				break;
			case 2:
				DepartmentFunction.getDepByID();
				;
				break;
			case 3:
				DepartmentFunction.isDepartmentNameExists();
				;
				break;
			case 4:
				DepartmentFunction.createDep();
				;
				break;
			case 5:
				DepartmentFunction.updateDepartmentName();
				;
				break;
			case 6:
				DepartmentFunction.delDepByID();
				;
				break;
			case 7:
				return;
			default:
				System.out.println("Nhập lại:");
				break;
			}
		}

	}

	private static void getMenuAccount() throws Exception {

		while (true) {
			String leftAlignFormat = "| %-72s |%n";
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|                        MỜI BẠN CHỌN CHỨC NĂNG                            |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "1. Hiển thị danh sách Account trên hệ thống");
			System.out.format(leftAlignFormat, "2. Tìm Account theo ID");
			System.out.format(leftAlignFormat, "3. Check account name exists");
			System.out.format(leftAlignFormat, "4. Thêm mới Account");
			System.out.format(leftAlignFormat, "5. Cập nhật thông tin Account đang có");
			System.out.format(leftAlignFormat, "6. Xoá Account theo ID");
			System.out.format(leftAlignFormat, "7. Thoát");
			System.out.format("+--------------------------------------------------------------------------+%n");
			switch (ScannerUltis.inputIntPositive()) {
			case 1:
				AccountFunction.showAccount();
				break;
			case 2:
				AccountFunction.showAccountById();
				break;
			case 3:
				AccountFunction.isAccNameExists();
				break;
			case 4:
				AccountFunction.createAccount();
				break;
			case 5:
				AccountFunction.updateAccount();
				break;
			case 6:
				AccountFunction.deleteById();
				break;
			case 7:
				return;
			default:
				System.out.println("Nhập lại:");
				break;
			}
		}
	}

}
