package com.quickgrowup.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quickgrowup.com.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

	
  Product	findByName( String name);
}
