package com.purbarun.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purbarun.springcore.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public String getProduct() {
		return productRepository.getProduct();
	}
}
