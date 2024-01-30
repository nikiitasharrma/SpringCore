package com.springcore.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.addition.Addition;

public class Client {
	
	public static void main(String[] args) {
		
		//Setter injection
		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/springcore/student/SetterInjection.xml");
		System.out.println(context1.getBean("student"));
		
		//Constructor injection
		ApplicationContext context2 = new ClassPathXmlApplicationContext("com/springcore/student/ConstructorInjection.xml");
		System.out.println(context2.getBean("student"));
		
		ApplicationContext context3 = new ClassPathXmlApplicationContext("com/springcore/addition/ConstructorOrder.xml");
		Addition a = (Addition) context3.getBean("addition");
		a.sum();
	}
}
