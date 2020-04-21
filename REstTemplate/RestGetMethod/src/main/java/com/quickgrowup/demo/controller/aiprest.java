package com.quickgrowup.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class aiprest {
	
	@Autowired
	private RestTemplate resttemplate;
	
	@GetMapping("/getDetails")
	public List<Object> getDetails(){
		
		String url="https://jsonplaceholder.typicode.com/posts";
		
	Object[]objects=resttemplate.getForObject(url, Object[].class);
	
		return Arrays.asList(objects);
		
		
		
	}

}
