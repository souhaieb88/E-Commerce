package com.hellomvc.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hellomvc.dao.ProductDao;
import com.hellomvc.model.Product;

@Controller
public class HelloController {
	ProductDao productDao = new ProductDao();
	@RequestMapping("/")
	public String hello() {
		
		return "hello";
	}
	
	@RequestMapping("/ProductList") 
	public String getProductList(Model model) {
		
		List<Product> products = productDao.getProducts();
		model.addAttribute("products",products);
		return "productList";
	}
	
	@RequestMapping("/ProductList/ViewProduct/{productId}")
	public String viewProduct(@PathVariable String productId,Model model) throws IOException{
		Product product = productDao.getProductById(productId);
		model.addAttribute(product);
		
		return "viewProduct";
	}
	

}
