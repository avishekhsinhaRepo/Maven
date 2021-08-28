package com.products.crud.productservices.bo;

import com.products.crud.productservices.dto.Product;

public interface ProductBO {
	void createProduct(Product product);
	Product findProductById(int id);

}
