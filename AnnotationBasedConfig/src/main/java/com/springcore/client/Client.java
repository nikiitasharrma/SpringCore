package com.springcore.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/student/stereoConfig.xml");
		System.out.println(context.getBean("student"));
		
		//prints different hashCode everytime, since bean scope is "prototype"
		System.out.println(context.getBean("student").hashCode());
		System.out.println(context.getBean("student").hashCode());
	}
}
