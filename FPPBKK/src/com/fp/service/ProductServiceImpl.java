package com.fp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fp.dao.ProductsDAO;
import com.fp.entity.Products;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductsDAO productsDAO;
	
	@Override
	@Transactional
	public List<Products> getProducts() {
		return productsDAO.getProducts();
	}

	@Override
	@Transactional
	public Products getProduct(int theId) {
		return productsDAO.getProduct(theId);
	}

	@Override
	@Transactional
	public void saveProduct(Products theProduct) {
		productsDAO.saveProduct(theProduct);
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void deleteProduct(int theId) {
		// TODO Auto-generated method stub
		productsDAO.deleteProduct(theId);
	}

}
