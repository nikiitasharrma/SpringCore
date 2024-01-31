package com.springcore.xmlbased;

public class Sunscreen {
	
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
		return "Sunscreen [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Executing init method by xml config");
	}
	
	public void destroy() {
		System.out.println("Executing destroy method by xml config");
	}
}
