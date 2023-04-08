package com.ty.shopping_kart.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import com.ty.shopping_kart.dto.Product;
import com.ty.shopping_kart.service.ProductService;

public class ProductControl {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		
		Product product = new Product();
//		product.setName("T-Shirt");
//		product.setBrand("RoadStar");
//		product.setPrice(899);
//		product.setType("cotton");
//		product.setSize("");
//		product.setDescription("pure cotton with full sleeve");
		
		ProductService productService = new ProductService();
//		Product product1 = productService.saveProductService(product);
//		if(product1 != null)
//		{
//			System.out.println("Insert data is successfully");
//		}
//		else
//		{
//			System.out.println("No data is found");
//		}
		Product res = productService.getProductById(2);
//		if(res != null) {
//			System.out.println("ID: "+res.getId());
//			System.out.println("Name: "+res.getName());
//			System.out.println("Brand: "+res.getBrand());
//			System.out.println("Price: "+res.getPrice());
//			System.out.println("Type: "+res.getType());
//			System.out.println("Size: "+res.getSize());
//			System.out.println("Description: "+res.getDescription());
//		}
//		else {
//			System.out.println("Data for the given Id is not found");
//		}
//		list = service.getAllProduct();
//		if (list.size() > 0) {
//			for (Product p : list) {
//				System.out.println("ID: " + p.getId());
//				System.out.println("Name: " + p.getName());
//				System.out.println("Brand: " + p.getBrand());
//				System.out.println("Price: " + p.getPrice());
//				System.out.println("Type: " + p.getType());
//				System.out.println("Size: " + p.getSize());
//				System.out.println("Description: " + p.getDescription());
//				System.out.println("-------------------------------------");
//			}
//		} else {
//			System.out.println("Data not available");
//		}
		
//		Product res = service.deleteProductById(2);
//		if(res != null) {
//			System.out.println("Data is deleted successfully");
//		}else {
//			System.out.println("Something wenrt wrong data cannot be deleted");
//		}
		
//		Product res = service.getProductByBrand("SONY");
//		
//			if(res != null) {
//				System.out.println("ID: " + res.getId());
//				System.out.println("Name: " + res.getName());
//				System.out.println("Brand: " + res.getBrand());
//				System.out.println("Price: " + res.getPrice());
//				System.out.println("Type: " + res.getType());
//				System.out.println("Size: " + res.getSize());
//				System.out.println("Description: " + res.getDescription());
//				System.out.println("-------------------------------------");
//			}
//		 else {
//			System.out.println("Data not available");
//		}
		
		Product res1 = productService.getProductByPrice(899);
		if(res1 != null) {
			System.out.println("ID: "+res1.getId());
			System.out.println("Name: "+res1.getName());
			System.out.println("Brand: "+res1.getBrand());
			System.out.println("Price: "+res1.getPrice());
			System.out.println("Type: "+res1.getType());
			System.out.println("Size: "+res1.getSize());
			System.out.println("Description: "+res1.getDescription());
		}
		else {
			System.out.println("Data for the given Id is not found");
		}
	}
}
