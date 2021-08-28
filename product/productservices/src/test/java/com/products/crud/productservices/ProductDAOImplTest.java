package com.products.crud.productservices;

import static org.junit.Assert.*;

import org.junit.Test;

import com.products.crud.productservices.dao.ProductDAO;
import com.products.crud.productservices.dao.ProductDAOImpl;
import com.products.crud.productservices.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void testCreateProduct() {
		ProductDAO productDAO = new ProductDAOImpl();
		
		Product product = new Product();
		product.setId(1);
		product.setName("Phone");
		product.setDescription("Branded");
		product.setPrice(1200);
		productDAO.create(product);
		Product fetchedProduct = productDAO.find(1);
		assertEquals(product.getName(), fetchedProduct.getName());
		
	}

}
