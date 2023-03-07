package com.vti.backend.datalayer;

import java.sql.SQLException;

import com.vti.entity.Manufacturer;

public interface IManufacturerRepository {

	Manufacturer getManufacturerbyID(int idFind) throws ClassNotFoundException, SQLException;

}
