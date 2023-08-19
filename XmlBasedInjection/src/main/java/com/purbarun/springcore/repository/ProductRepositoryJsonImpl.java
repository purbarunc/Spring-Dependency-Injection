package com.purbarun.springcore.repository;

public class ProductRepositoryJsonImpl implements ProductRepository {
	@Override
	public String getProduct() {
		return "Received Product from Json File!";
	}
}
