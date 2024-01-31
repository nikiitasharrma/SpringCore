package com.springcore.student;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address { 
	
	@Value("Baker street")
	private String street;
	
	@Value("London")
	private String city;
	
	//Constructors
	public Address() {
		
	}
	
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	
	//Getters-Setters
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	
}