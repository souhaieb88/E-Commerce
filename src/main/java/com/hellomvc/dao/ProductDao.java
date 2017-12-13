package com.hellomvc.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hellomvc.model.Product;

public class ProductDao {
	
	private List<Product> productList;
	public List<Product> getProducts(){
		productList = new ArrayList<Product>();
		Product product1 = new Product();
		product1.setProductName("guitar1");
		product1.setProductId("Prod1");
		product1.setProductCategory("Instrument");
		product1.setProductCondition("New");
		product1.setProductDescription("this is a good guitar");
		product1.setProductPrice(1200.0);
		product1.setProductStatus("Active");
		product1.setProductManufacturer("Ardia");
		product1.setUnitInStock(11);
		
		Product product2 = new Product();
		product2.setProductName("Record1");
		product2.setProductId("Prod2");
		product2.setProductCategory("Record");
		product2.setProductCondition("New");
		product2.setProductDescription("this is an awesome mix of 20th centutry ");
		product2.setProductPrice(25.0);
		product2.setProductStatus("Active");
		product2.setProductManufacturer("Weevio");
		product2.setUnitInStock(51);
		
		Product product3 = new Product();
		product3.setProductName("Speaker1");
		product3.setProductId("Prod3");
		product3.setProductCategory("Accessory");
		product3.setProductCondition("New");
		product3.setProductDescription("this is a Polk shelf speaker!");
		product3.setProductPrice(355.0);
		product3.setProductStatus("Active");
		product3.setProductManufacturer("Sofrecom");
		product3.setUnitInStock(51);
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		
		return productList;
	}

	public Product getProductById(String productId) throws IOException{
		
		for(Product product:productList) {
			
			if(product.getProductId().equals(productId)) {
				return product;
			}
		}
		
		throw new IOException("No product found");
	}
}
