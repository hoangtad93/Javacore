package com.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Product;

public interface IProductRepository {

	List<Product> getProductInfo() throws ClassNotFoundException, SQLException;

	Product getProductById(int id) throws SQLException, Exception;

	boolean delProductById(int id) throws SQLException, ClassNotFoundException;

}
