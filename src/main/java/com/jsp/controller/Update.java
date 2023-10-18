package com.jsp.controller;


import com.jsp.dto.Product;
import com.jsp.services.ProductService;

public class Update {

	public static void main(String[] args) {
		ProductService productservice=new ProductService();
		Product product=productservice.updateProductName(2, "Akshata Wakde");
		System.out.println(product.getName());
		

	}

} 