package com.springcore.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.HelloSpringConfiguration;

public class BeanClient {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext
				                                             (HelloSpringConfiguration.class);
		System.out.println("Hello " + context.getBean("name") + "!");
	}
}
