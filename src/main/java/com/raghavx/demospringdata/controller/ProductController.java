package com.raghavx.demospringdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.raghavx.demospringdata.model.Product;
import com.raghavx.demospringdata.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/product/upload")
	public Product upload() {
		return new Product();
	}
	
	@PostMapping("/product/upload")
	public Product upload(@RequestBody Product product) {
		return productService.save(product);
	}
	
	@GetMapping("/product/list")
	public List<Product> listAll(){
		return productService.listAll();
	}
	
	// To delete  a Product 
	// To Modify a Product 
	
	
}
