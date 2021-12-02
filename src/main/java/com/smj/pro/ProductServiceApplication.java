package com.smj.pro;

import com.smj.pro.models.Product;
import com.smj.pro.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class ProductServiceApplication {

	@Autowired
	ProductService service;

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
		
		System.out.println("Hello Suwarna"); 
	}

	@GetMapping("/welcome")
	public String getData(){
		return "Hello Suwarna";
	}

	@GetMapping("/products")
	public List<Product> getProduct(){

		return service.getProducts();
	}

}
