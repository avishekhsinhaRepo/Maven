package com.products.crud.productservices.dao;

import java.util.HashMap;
import java.util.Map;

import com.products.crud.productservices.dto.Product;

public class ProductDAOImpl implements ProductDAO {

	
	static Map<Integer, Product> products = new HashMap<Integer, Product>();
	
	public void create(Product product) {
		products.put(product.getId(), product);
	}

	public Product find(int productId) {
		return products.get(productId);
	}

	public void update(Product product) {
		// TODO Auto-generated method stub

	}

	public void delete(int productId) {
		// TODO Auto-generated method stub

	}

}
