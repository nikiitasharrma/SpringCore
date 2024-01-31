package com.springcore.annotationbased;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Primer {
	
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
		return "Primer [price=" + price + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Executing init method by annotations");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Executing destroy method by annotations");
	}
}
