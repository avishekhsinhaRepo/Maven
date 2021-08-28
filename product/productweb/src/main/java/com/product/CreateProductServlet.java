package com.product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.products.crud.productservices.bo.ProductBO;
import com.products.crud.productservices.bo.ProductBOImpl;
import com.products.crud.productservices.dto.Product;

/**
 * Servlet implementation class CreateProductServlet
 */

public class CreateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String description = request.getParameter("desc");
		Integer price = Integer.parseInt(request.getParameter("price"));

		Product product = new Product();
		product.setId(id);
		product.setName(name);
		product.setDescription(description);
		product.setPrice(price);
		
		ProductBO bo = new ProductBOImpl();
		bo.createProduct(product);
		
		PrintWriter out = response.getWriter();
		out.print("Product Created!!!");
	}

}
