package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.IProductService;
import com.vti.backend.businesslayer.ProductService;
import com.vti.entity.Product;

public class ProductController {
	private IProductService productService;

	public ProductController() throws FileNotFoundException, IOException {
		productService = new ProductService();
	}

	public List<Product> getProductInfo() throws ClassNotFoundException, SQLException {
		List<Product> listProducts = productService.getProductInfo();
		return listProducts;
	}

	public Object getProductById(int id) throws SQLException, Exception {
		Product product = productService.getProductById(id);
		return product;
	}

	public boolean delProductById(int id) throws ClassNotFoundException, SQLException {
		return productService.delProductById(id);
	}

}
