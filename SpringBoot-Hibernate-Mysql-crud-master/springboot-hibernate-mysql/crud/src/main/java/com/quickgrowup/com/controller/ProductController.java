package com.quickgrowup.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quickgrowup.com.entity.Product;
import com.quickgrowup.com.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	
	@PostMapping( value ="/addProduct" ,consumes = "application/json", produces = "application/json" )
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
		
	}
	
	@PostMapping(value ="/addProducts" ,consumes = "application/json", produces = "application/json")
	public List<Product> addProduct(@RequestBody List<Product> products) {
		return service.saveProduct(products);
		
	}
	
	@GetMapping(value ="/products" ,consumes = "application/json", produces = "application/json")
	public List<Product> findAllProducts(){
		
		return service.getProducts();
	}
	
	@GetMapping("/productid/{id}")
	public Product findProductById(@PathVariable int id) {
		
		return service.getProductById(id);  
	}
	
	@GetMapping("/productname/{name}")
public Product findProductByName(@PathVariable String name) {
		
		return service.getProductByName(name);  
	}
	
	
	@PutMapping(value ="/update" ,consumes = "application/json", produces = "application/json")
	public Product UpdateProduct(@RequestBody Product product) {
		
		return service.saveProduct(product);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		
		
		return  service.deleteProduct(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
