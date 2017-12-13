package com.hellomvc.model;

public class Product {
	
	private String ProductId;
	private String ProductName;
	private String ProductCategory;
	private String ProductDescription;
	private String ProductStatus;
	private String ProductCondition;
	private Double ProductPrice;
	private String ProductManufacturer;
	private int unitInStock;
	public String getProductCategory() {
		return ProductCategory;
	}
	public String getProductCondition() {
		return ProductCondition;
	}
	public String getProductDescription() {
		return ProductDescription;
	}
	public String getProductId() {
		return ProductId;
	}
	public String getProductManufacturer() {
		return ProductManufacturer;
	}
	public String getProductName() {
		return ProductName;
	}
	public Double getProductPrice() {
		return ProductPrice;
	}
	public String getProductStatus() {
		return ProductStatus;
	}
	public int getUnitInStock() {
		return unitInStock;
	}
	public void setProductCategory(String productCategory) {
		ProductCategory = productCategory;
	}
	public void setProductCondition(String productCondition) {
		ProductCondition = productCondition;
	}
	public void setProductDescription(String productDescription) {
		ProductDescription = productDescription;
	}
	public void setProductId(String productId) {
		ProductId = productId;
	}
	public void setProductManufacturer(String productManifucturer) {
		ProductManufacturer = productManifucturer;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public void setProductPrice(Double productPrice) {
		ProductPrice = productPrice;
	}
	public void setProductStatus(String productStatus) {
		ProductStatus = productStatus;
	}
	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
	
}
