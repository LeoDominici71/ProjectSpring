package com.springleo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springleo.course.entities.Product;
import com.springleo.course.repositories.ProductRepositories;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepositories repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
