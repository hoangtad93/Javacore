package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Manufacturer;

public interface IManufacturerService {

	Manufacturer getManufacturerbyID(int idFind) throws ClassNotFoundException, SQLException;

	List<Manufacturer> getListmanufacturers();

}
