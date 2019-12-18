package com.raghavx.demospringdata.service;

import java.util.List;

import com.raghavx.demospringdata.model.Product;

public interface ProductService {

	Product save(Product product);
	
	List<Product> listAll();
}
