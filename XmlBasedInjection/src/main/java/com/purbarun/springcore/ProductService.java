package com.purbarun.springcore;

import com.purbarun.springcore.repository.ProductRepository;

public class ProductService {
	private ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public String getProduct() {
		return productRepository.getProduct();
	}
}
