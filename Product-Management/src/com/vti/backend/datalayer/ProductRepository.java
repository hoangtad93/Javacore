package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Manufacturer;
import com.vti.entity.Product;
import com.vti.ultis.jdbcUltis;

public class ProductRepository implements IProductRepository {
	private jdbcUltis jdbc;
	private IManufacturerRepository manufacturerRepository;

	public ProductRepository() throws FileNotFoundException, IOException {
		jdbc = new jdbcUltis();
		manufacturerRepository = new ManufacturerRepository();

	}

	@Override
	public List<Product> getProductInfo() throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM product ORDER BY ProductId";
		ResultSet resultSet = jdbc.executeQuery(sql);

		List<Product> listProducts = new ArrayList<>();
		while (resultSet.next()) {
			Product product = new Product();
			product.setProductId(resultSet.getInt(1));
			product.setProductName(resultSet.getString(2));
			product.setProductPrice(resultSet.getString(3));
			product.setProductInfo(resultSet.getString(4));
			product.setProductDetail(resultSet.getString(5));
			product.setRatingStar(resultSet.getInt(6));

			Manufacturer manufacturer = manufacturerRepository.getManufacturerbyID(resultSet.getInt(8));
			product.setManufacturerId(manufacturer);

			listProducts.add(product);
		}

		return listProducts;

	}

	@Override
	public Product getProductById(int id) throws SQLException, ClassNotFoundException {
		String sql = "SELECT * FROM product WHERE ProductId = ?";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setInt(1, id);
		ResultSet resultSet = preStatement.executeQuery();
		if (resultSet.next()) {
			Product product1 = new Product();
			product1.setProductId(resultSet.getInt(1));
			product1.setProductName(resultSet.getString(2));
			product1.setProductPrice(resultSet.getString(3));
			product1.setProductInfo(resultSet.getString(4));
			product1.setProductDetail(resultSet.getString(5));
			// product1.setProductImageName(resultSet.getString(6));
			product1.setRatingStar(resultSet.getInt(7));

			Manufacturer manufacturer = manufacturerRepository.getManufacturerbyID(resultSet.getInt(8));
			product1.setManufacturerId(manufacturer);
			return product1;
		} else {
			return null;
		}

	}

	@Override
	public boolean delProductById(int id) throws SQLException, ClassNotFoundException {
		String sql = "DELETE FROM product WHERE (ProductId = ?);";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setInt(1, id);
		int result = preStatement.executeUpdate();
		if (result == 1) {
			return true;
		} else {
			return false;
		}

	}

}
