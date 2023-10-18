package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.services.ProductService;

public class GetById {
	public static void main(String[] args) {
		ProductService productservice=new ProductService();
		Product product=productservice.getProductById(1);
		if(product!=null) {
		System.out.println(product.getBrand());
		System.out.println(product.getName());
		}
		else {
			System.out.println("Incorrect Id");
		}

		}

}
