package com.purbarun.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purbarun.springcore.repository.ProductRepository;

@Service
public class ProductService {
	private ProductRepository productRepository;

	public ProductService() {
	}
	
	@Autowired
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public String getProduct() {
		return productRepository.getProduct();
	}
}
