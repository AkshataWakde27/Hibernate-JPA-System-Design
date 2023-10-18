package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Product;
import com.jsp.services.ProductService;



public class GetAll {
public static void main(String[] args) {
	ProductService productservice= new ProductService();
	List<Product> products=productservice.getAllProducts();
	
	for(Product p : products) {
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getBrand());
		System.out.println("=========================================");
	}
	}
	}
	
	


