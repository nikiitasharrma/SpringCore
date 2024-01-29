package com.springcore.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.People;

public class BeanClient {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext
				                                             (People.class);
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("Permanent address"));
		
	}
}
