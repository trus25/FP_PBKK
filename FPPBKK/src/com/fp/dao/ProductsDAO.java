package com.fp.dao;

import java.util.List;

import com.fp.entity.Products;

public interface ProductsDAO {
	public List<Products> getProducts();

	public Products getProduct(int theId);

	public void saveProduct(Products theProduct);

	public void deleteProduct(int theId);
}
