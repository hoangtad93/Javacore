package com.vti.entity;

public class Product {
	private int productId;
	private String productName;
	private String productInfo;
	private String productPrice;
	private String productDetail;
	private int ratingStar;
	private String productImageName;
	private Manufacturer manufacturerId;
	private Category categoryId;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
	}

	public int getRatingStar() {
		return ratingStar;
	}

	public void setRatingStar(int ratingStar) {
		this.ratingStar = ratingStar;
	}

	public String getProductImageName() {
		return productImageName;
	}

	public void setProductImageName(String productImageName) {
		this.productImageName = productImageName;
	}

	public Manufacturer getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(Manufacturer manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public Category getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productInfo=" + productInfo
				+ ", productPrice=" + productPrice + ", productDetail=" + productDetail + ", ratingStar=" + ratingStar
				+ ", productImageName=" + productImageName + ", manufacturerId=" + manufacturerId + ", categoryId="
				+ categoryId + "]";
	}

}
