package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vti.entity.Manufacturer;
import com.vti.ultis.jdbcUltis;

public class ManufacturerRepository implements IManufacturerRepository {
	private jdbcUltis jdbc;

	public ManufacturerRepository() throws FileNotFoundException, IOException {
		jdbc = new jdbcUltis();
	}

	@Override
	public Manufacturer getManufacturerbyID(int idFind) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM manufacturer WHERE ManufacturerId = ?";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setInt(1, idFind);
		ResultSet resultSet = preStatement.executeQuery();
		if (resultSet.next()) {
			Manufacturer manufacturer = new Manufacturer();
			manufacturer.setManufactureId(resultSet.getInt(1));
			manufacturer.setManufacturerName(resultSet.getString(2));
			return manufacturer;

		} else {
			return null;
		}

	}

}
