package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Product;



public class ProductDao {
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	
		EntityManager entitymanager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entitymanager.getTransaction();
		
	//To save product
	public Product saveProduct(Product product) {
      
		 entityTransaction.begin();
		 entitymanager.persist(product);
		   entityTransaction.commit();
		return product;
	}
	
	//get by id 
	public Product getProductById(int id) {
		return entitymanager.find(Product.class,id);
	}
	
	
		//to delete
		public boolean deleteProductById(int id) {
		Product product = entitymanager.find(Product.class,id);
		entityTransaction.begin();
		 entitymanager.persist(product);
		   entityTransaction.commit();
		return true;
		
		
		}
		public List<Product> gettAllProduct(){
			String jpql="SELECT p FROM Product p";
			Query query=entitymanager.createQuery(jpql);
			List<Product> products= query.getResultList();
			return products;
		}
		public Product updateProductName(int id,Product product) {
			if(product !=null) {
				entityTransaction.begin();
				entitymanager.merge(product);
				entityTransaction.commit();
				return product;
				}
			else {
				return null;
			}
			
			}
		}
		
		




