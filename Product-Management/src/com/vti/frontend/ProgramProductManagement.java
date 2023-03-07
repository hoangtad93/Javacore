package com.vti.frontend;

import com.vti.ultis.ScannerUltis;

public class ProgramProductManagement {
	public static void main(String[] args) throws Exception {

		while (true) {
			String leftAlignFormat = "| %-72s |%n";
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|                        MỜI BẠN CHỌN CHỨC NĂNG                            |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");

			System.out.format(leftAlignFormat, "1. Tìm nhà sản xuất theo ID.");
			System.out.format(leftAlignFormat, "2. Xem danh sách thông tin sản phẩm trên hệ thống.");
			System.out.format(leftAlignFormat, "3. Xoá sản phẩm theo ID.");
			System.out.format(leftAlignFormat, "4. Cập nhật tên sản phẩm đang có.");
			System.out.format(leftAlignFormat, "5. Thêm mới Sản phẩm.");
			System.out.format(leftAlignFormat, "6. Chức năng kiểm tra Email.");
			System.out.format(leftAlignFormat, "7. Exit");
			System.out.format("+--------------------------------------------------------------------------+%n");
			switch (ScannerUltis.inputIntPositive()) {
			case 1:
				ManufacturerFunction.findManufacturerById();
				break;
			case 2:
				ProductFunction.showProductInfo();
				break;
			case 3:
				ProductFunction.deleteProductById();

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			default:
				System.out.println("Nhập lại:");
				break;
			}
		}
	}
}