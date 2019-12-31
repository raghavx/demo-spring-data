package com.raghavx.demospringdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/2")
	public String secondHomePage() {
		return "home/home";
	}
}
