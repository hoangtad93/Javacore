package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.ProductController;
import com.vti.entity.Product;
import com.vti.ultis.ScannerUltis;

public class ProductFunction {
//	private static ProductController productController;
//
//	public ProductFunction() throws FileNotFoundException, IOException {
//		productController = new ProductController();
//	}

	public static void showProductInfo()
			throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		ProductController productController = new ProductController();
		System.out.println("Hiển thị danh sách thông tin sản phẩm trên HT");
		List<Product> listProducts = productController.getProductInfo();
		String leftAlignFormat = "| %-4d | %-28s | %-16s | %-58s | %-27s | %-38s | %n";
		System.out.format(
				"+----+----------------------------+----------------+----------------------------------------------------------+---------------------------+--------------------------------------+%n");
		System.out.format(
				"|ID  | Tên                        | Giá            |   Chi tiết                                               | Số sao đánh giá           | Nhà sản xuất                         |%n");
		System.out.format(
				"+----+----------------------------+----------------+----------------------------------------------------------+---------------------------+--------------------------------------+%n");
		for (Product product : listProducts) {
			System.out.format(leftAlignFormat, product.getProductId(), product.getProductName(),
					product.getProductPrice(), product.getProductInfo(), product.getProductDetail(),
					product.getRatingStar(), product.getManufacturerId());
		}
		System.out.format(
				"+----+----------------------------+----------------+----------------------------------------------------------+---------------------------+--------------------------------------+%n");
	}

	public static void deleteProductById() throws Exception {
		ProductController productController = new ProductController();
		int id = getIdDelete();
		if (productController.delProductById(id)) {
			System.out.println("Xóa thành công");
		} else {
			System.out.println("Đã có lỗi xảy ra.");
		}

	}

	private static int getIdDelete() throws SQLException, Exception {
		ProductController productController = new ProductController();
		showProductInfo();
		while (true) {
			System.out.println("Nhập vào ID sản phẩm cần xóa: ");
			int id = ScannerUltis.inputIntPositive();
			if (productController.getProductById(id) != null) {
				return id;
			} else {
				System.out.println("Không có Account này trên hệ thống, Nhập lại: ");
			}
		}

	}

}
