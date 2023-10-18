package com.jsp.services;

import java.util.List;

import com.jsp.dao.ProductDao;
import com.jsp.dto.Product;

public class ProductService {
	ProductDao productDao=new ProductDao();
	public Product saveProduct(Product product) {
	return productDao.saveProduct(product);

}
	
	public Product updateProductName(int id,String name) {
		Product product=productDao.getProductById(id);
		product.setName(name);
		return productDao.updateProductName(id,product);
	}
	
	public Product getProductById(int id) {
		if(id>0) {
			return productDao.getProductById(id);
		}
		else {
			return null;
		}
	}
	
	public boolean deleteProductById(int id) {
		if(id>0) {
			return productDao.deleteProductById(id);
		}
		else {
			return false;
		}
		
}
	public List<Product> getAllProducts() {
		return productDao.gettAllProduct();
	}
	
}





