package com.springcore.interfacebased;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Moisturizer implements InitializingBean, DisposableBean {
	
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Inside setter method");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Moisturizer [price=" + price + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Executing destroy method by interface");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Executing init method by interface");
	}
	
	
}
