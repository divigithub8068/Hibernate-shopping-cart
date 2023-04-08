package com.ty.shopping_kart.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.shopping_kart.dto.Product;

public class ProductDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Product saveProduct(Product product)
	{
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		return product;
	}
	public Product getProductById(int id) {
		Product product = entityManager.find(Product.class, id);
		return product;
	}
	
	public List<Product> getAllProduct(){
		String sql = "Select p from Product p";
		Query query = entityManager.createQuery(sql);
		List<Product> list = query.getResultList();
		return list;
	}
	
	public Product deleteProductById(int id) {
		Product product = entityManager.find(Product.class, id);
		entityTransaction.begin();
		entityManager.remove(product);
		entityTransaction.commit();
		return product;
	}
	
	public Product getProductByBrand(String brand) {
		Product product = entityManager.find(Product.class, brand);
		return product;
	}
	
	public Product getProductByPrice(double price) {
		Product product = entityManager.find(Product.class, price);
		return product;
	}
}
