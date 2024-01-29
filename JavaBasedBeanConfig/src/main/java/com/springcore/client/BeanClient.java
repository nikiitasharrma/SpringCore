package com.springcore.client;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.People;
import com.springcore.Person;

public class BeanClient {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext
				                                             (People.class);
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("Person2"));
		System.out.println(context.getBean("Person3"));
		
		// retrieving bean by type. If multiple beans exist, prioritize one.  
		System.out.println(context.getBean(Person.class));
		
		//Listing all beans
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out :: println);
		
	}
}
