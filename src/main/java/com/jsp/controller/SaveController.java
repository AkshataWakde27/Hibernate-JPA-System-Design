package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.services.ProductService;

public class SaveController {



public static void main(String[] args) {
ProductService productservice=new ProductService();
Product product=new Product();
product.setBrand("xyz");
product.setName("abc");

Product p2=productservice.saveProduct(product);
if(p2 !=null) {
System.out.println("Product saved");
}

}
}
