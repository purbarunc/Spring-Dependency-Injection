package com.purbarun.springcore.repository;

public class ProductRepositoryDbImpl implements ProductRepository {
	@Override
	public String getProduct() {
		return "Received Product from DB!";
	}
}
