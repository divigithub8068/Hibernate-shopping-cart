package com.ty.shopping_kart.service;

import com.ty.shopping_kart.dao.ProductDao;
import com.ty.shopping_kart.dto.Product;
import com.ty.shopping_kart.util.AES;
import static com.ty.shopping_kart.util.AppConstants.SECRETE_KEY;

import java.util.ArrayList;
import java.util.List;
public class ProductService {
	List<Product> list = new ArrayList<Product>();
	ProductDao dao = new ProductDao();
	public Product saveProductService(Product product)
	{
		String enc = AES.encrypt(product.getDescription(),SECRETE_KEY);
		product.setDescription(enc);
		return dao.saveProduct(product);
	}
	public Product getProductById(int id) {
		Product product = dao.getProductById(id);
		String dec = AES.decrypt(product.getDescription(), SECRETE_KEY);
		product.setDescription(dec);
		return product;
	}

	public List<Product> getAllProduct() {

		list = dao.getAllProduct();
		for (Product product : list) {
			String dec = AES.decrypt(product.getDescription(), SECRETE_KEY);
			product.setDescription(dec);
		}
		return list;
	}
	
	public Product deleteProductById(int id) {
		Product product = dao.deleteProductById(id);
		return product;
	}
	
	public Product getProductByBrand(String brand){
		Product product = dao.getProductByBrand(brand);
		String dec = AES.decrypt(product.getDescription(), SECRETE_KEY);
		product.setDescription(dec);
		return product;
	}
	
	public Product getProductByPrice(double price) {
		Product product = dao.getProductByPrice(price);
		String dec = AES.decrypt(product.getDescription(), SECRETE_KEY);
		product.setDescription(dec);
		return product;
	}
}
