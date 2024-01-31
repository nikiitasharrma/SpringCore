package com.springcore.autowiring.xmlbased;

public class Student {
	
	private Address address2;
	
//    Constructors
	public Student() {
		
	}
	public Student(Address address2) {
		System.out.println("constructor called");
		this.address2 = address2;
	}

	//Getters Setters

	public Address getAddress() {
		return address2;
	}

	public void setAddress(Address address2) {
		System.out.println("setter called");
		this.address2 = address2;
	}

	@Override
	public String toString() {
		return "Student [address=" + address2 + "]";
	}
	
	
}
