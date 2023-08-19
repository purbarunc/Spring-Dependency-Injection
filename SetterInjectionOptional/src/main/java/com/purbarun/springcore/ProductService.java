package com.purbarun.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purbarun.springcore.repository.ProductRepository;

@Service
public class ProductService {
	private ProductRepository productRepository;

	@Autowired(required = false)
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public String getProduct() {
		if (productRepository != null) {
			return productRepository.getProduct();
		} else {
			return "Unable to Receive Product";
		}

	}
}
