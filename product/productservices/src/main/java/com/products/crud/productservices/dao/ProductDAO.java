package com.products.crud.productservices.dao;

import com.products.crud.productservices.dto.Product;

public interface ProductDAO {
	void create(Product product);

	Product find(int productId);

	void update(Product product);

	void delete(int productId);

}
