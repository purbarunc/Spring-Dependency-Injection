package com.purbarun.springcore.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryJsonImpl implements ProductRepository {
	@Override
	public String getProduct() {
		return "Received Product from Json File!";
	}
}
