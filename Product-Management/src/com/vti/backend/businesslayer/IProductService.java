package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Product;

public interface IProductService {

	List<Product> getProductInfo() throws ClassNotFoundException, SQLException;

	Product getProductById(int id) throws SQLException, Exception;

	boolean delProductById(int id) throws ClassNotFoundException, SQLException;

}
