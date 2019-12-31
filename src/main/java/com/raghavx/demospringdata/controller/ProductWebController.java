package com.raghavx.demospringdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.raghavx.demospringdata.model.Product;
import com.raghavx.demospringdata.service.ProductService;

@Controller
public class ProductWebController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/web/product")
	public String product(Model model) {
		model.addAttribute("product", new Product());
		return "product/product";
	}
	
	@PostMapping("/web/product")
	public String product(Model model,@ModelAttribute("product") Product product) {
		System.out.println(product.getName());
		model.addAttribute("product", new Product());
		return "product/product";
	}
	
	@GetMapping("/web/product/list")
	public String productList(Model model) {
		model.addAttribute("products", productService.listAll());
		return "product/listProduct";
	}

}
