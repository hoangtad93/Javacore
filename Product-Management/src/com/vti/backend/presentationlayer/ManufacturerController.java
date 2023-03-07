package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.IManufacturerService;
import com.vti.backend.businesslayer.ManufacturerService;
import com.vti.entity.Manufacturer;

public class ManufacturerController {
	private IManufacturerService manufacturerService;

	public ManufacturerController() throws FileNotFoundException, IOException {
		manufacturerService = new ManufacturerService();
	}

	public List<Manufacturer> getListManufacturers()
			throws FileNotFoundException, ClassNotFoundException, SQLException, IOException {

		return manufacturerService.getListmanufacturers();
	}

	public Manufacturer getManufacturerbyID(int idFind) throws ClassNotFoundException, SQLException {
		Manufacturer manufacturer = manufacturerService.getManufacturerbyID(idFind);
		return manufacturer;
	}

}
