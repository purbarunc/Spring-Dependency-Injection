package com.purbarun.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.purbarun.springcore")
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		ProductService productService = context.getBean(ProductService.class);
		String msg = productService.getProduct();
		System.out.println(msg);
		((ConfigurableApplicationContext) context).close();
	}
}
