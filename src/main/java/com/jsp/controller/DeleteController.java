package com.jsp.controller;

import com.jsp.services.ProductService;

public class DeleteController {
	public static void main(String[] args) {
		ProductService productservice=new ProductService();
		new ProductService();
		boolean flag= productservice.deleteProductById(2);
		if (flag==true) {
		System.out.println("Product deleted");
		}
		else {
			System.out.println("Product not deleted");
			}
		}
		
}
