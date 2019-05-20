package com.fp.service;

import java.util.List;

import com.fp.entity.Products;

public interface ProductService {
	public List<Products> getProducts();

	public Products getProduct(int theId);

	public void saveProduct(Products theProduct);

	public void deleteProduct(int theId);
}
