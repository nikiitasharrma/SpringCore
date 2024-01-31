package com.springcore.autowiring.annotation;

/**
 * @Autowired annotation can be used at 3 places- 
 * on top of declaration, setter or constructor
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	@Qualifier("address2")
	private Address address;
	
//    Constructors
	public Employee() {
		
	}

//	@Autowired
	public Employee(Address address) {
		System.out.println("constructor called");
		this.address = address;
	}

	//Getters Setters
	public Address getAddress() {
		return address;
	}

//	@Autowired
	public void setAddress(Address address) {
		System.out.println("setter called");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	
	
}
