package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.presentationlayer.ManufacturerController;
import com.vti.entity.Manufacturer;
import com.vti.ultis.ScannerUltis;

public class ManufacturerFunction {
	private static ManufacturerController manufacturerController;

	public ManufacturerFunction() throws FileNotFoundException, IOException {
		manufacturerController = new ManufacturerController();
	}

	public static void findManufacturerById() throws ClassNotFoundException, SQLException {
		System.out.println("Tìm nhà sản xuất theo ID!");
		System.out.println("Nhập ID nhà sản xuất cần tìm:");

		int idFind = ScannerUltis.inputIntPositive();
		Manufacturer manufacturer = manufacturerController.getManufacturerbyID(idFind);
		if (manufacturer != null) {
			String leftAlignFormat = "| %-16d | %-33s | %n";
			System.out.format("+----------------+---------------------------------+%n");
			System.out.format("| ManufacturerID |         ManufacturerName        |%n");
			System.out.format("+----------------+---------------------------------+%n");

			System.out.format(leftAlignFormat, manufacturer.getManufactureId(), manufacturer.getManufacturerName());

			System.out.format("+----------------+---------------------------------+%n");

		} else {
			System.out.println("Không tồn tại nhà sản xuất này trên Hệ thống");
		}

	}

}
