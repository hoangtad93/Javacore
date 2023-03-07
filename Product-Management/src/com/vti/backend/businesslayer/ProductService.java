package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.IProductRepository;
import com.vti.backend.datalayer.ProductRepository;
import com.vti.entity.Product;

public class ProductService implements IProductService {
	private IProductRepository productRepository;
	

	public ProductService() throws FileNotFoundException, IOException {
		productRepository = new ProductRepository();
	}


	@Override
	public List<Product> getProductInfo() throws ClassNotFoundException, SQLException {
		List<Product> listProducts = productRepository.getProductInfo();
		return listProducts;
	}


	@Override
	public Product getProductById(int id) throws SQLException, Exception {
		Product product = productRepository.getProductById(id);
		return product;
	}


	@Override
	public boolean delProductById(int id) throws ClassNotFoundException, SQLException {
		return productRepository.delProductById(id);
	}

}
