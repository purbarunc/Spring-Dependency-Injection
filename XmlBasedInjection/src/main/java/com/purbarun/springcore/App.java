package com.purbarun.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ProductService productService = (ProductService) context.getBean("productService");
		String msg = productService.getProduct();
		System.out.println(msg);
		((ConfigurableApplicationContext) context).close();
	}
}
