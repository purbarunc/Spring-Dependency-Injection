package com.purbarun.springcore.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class ProductRepositoryDbImpl implements ProductRepository {
	@Override
	public String getProduct() {
		return "Received Product from DB!";
	}
}
