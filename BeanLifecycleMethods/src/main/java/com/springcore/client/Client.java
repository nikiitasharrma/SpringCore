package com.springcore.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/client/config.xml");
		System.out.println(context.getBean("sunscreen"));
		System.out.println(context.getBean("moisturizer"));
		System.out.println(context.getBean("primer"));
		context.registerShutdownHook();
		
	}

}
