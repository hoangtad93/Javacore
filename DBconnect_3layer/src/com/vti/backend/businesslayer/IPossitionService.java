package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Position;

	public interface IPossitionService {
		public List<Position> getListPosition() throws ClassNotFoundException, SQLException;

		public Position getPosByID(int id) throws ClassNotFoundException, SQLException;
	}