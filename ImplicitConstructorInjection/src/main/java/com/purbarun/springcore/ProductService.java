package com.purbarun.springcore;

import org.springframework.stereotype.Service;

import com.purbarun.springcore.repository.ProductRepository;

@Service
public class ProductService {
	private ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public String getProduct() {
		return productRepository.getProduct();
	}
}
