package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.IManufacturerRepository;
import com.vti.backend.datalayer.ManufacturerRepository;
import com.vti.entity.Manufacturer;

public class ManufacturerService implements IManufacturerService {
	private IManufacturerRepository manufacturerRepository;

	public ManufacturerService() throws FileNotFoundException, IOException {
		manufacturerRepository = new ManufacturerRepository();
	}

	@Override
	public Manufacturer getManufacturerbyID(int idFind) throws ClassNotFoundException, SQLException {
		Manufacturer manufacturer = manufacturerRepository.getManufacturerbyID(idFind);
		return manufacturer;
	}

	@Override
	public List<Manufacturer> getListmanufacturers() {
		// TODO Auto-generated method stub
		return null;
	}

}
