package com.products.crud.productservices.bo;

import com.products.crud.productservices.dao.ProductDAO;
import com.products.crud.productservices.dao.ProductDAOImpl;
import com.products.crud.productservices.dto.Product;

public class ProductBOImpl implements ProductBO {

	private ProductDAO productDAO = new ProductDAOImpl();
	
	public void createProduct(Product product) {
		productDAO.create(product);

	}

	public Product findProductById(int id) {
		return productDAO.find(id);

	}

}
