package com.springcore.autowiring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowiring/xmlbased/autowiringConfig.xml");
//		System.out.println(context.getBean("student1"));
		System.out.println(context.getBean("student2"));
//		System.out.println(context.getBean("student3"));

	}
}
