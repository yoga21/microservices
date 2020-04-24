package com.quickgrowup.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quickgrowup.com.entity.Product;
import com.quickgrowup.com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product saveProduct(Product product) {
		
		return productRepository.save(product);
		
	}
	
	
	public List<Product> saveProduct(List<Product> products) {
		
		return productRepository.saveAll(products);
		
	}
	
	
	public List<Product> getProducts(){
		
		return productRepository.findAll();
	}
	
	public Product getProductById(int id) {
		
		return productRepository.findById(id).orElse(null);
	}
	
	
     public Product getProductByName(String name) {
		
		return productRepository.findByName(name);
	}
	
     public String deleteProduct(int id) {
    	 
    	 productRepository.deleteById(id);
		return "product removed !!" +id;
     }
	
	
     public Product UpdateProduct(Product product) {
    	 Product existingProduct= productRepository.findById(product.getId()).orElse(null);
    	 existingProduct.setName(product.getName());
    	 existingProduct.setQuantity(product.getQuantity());
    	 existingProduct.setPrice(product.getPrice());
    	 
		return productRepository.save( existingProduct ) ;
    	 
     }
	 
	
	
	
	
	
	
	
}
