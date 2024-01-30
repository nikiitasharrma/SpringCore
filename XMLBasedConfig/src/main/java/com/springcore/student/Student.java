package com.springcore.student;

import java.util.HashMap;
import java.util.List;

public class Student {
	
	private String name;
	
	private int age;
	
	private Address address;
	
	private List<String> subjects;
	
	private HashMap<String,String> marksheet;
	
//    Constructors
	public Student() {
		
	}
	public Student(String name, int age, Address address, List<String> subjects, HashMap<String, String> marksheet) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.subjects = subjects;
		this.marksheet = marksheet;
	}

	//Getters Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public HashMap<String, String> getMarksheet() {
		return marksheet;
	}

	public void setMarksheet(HashMap<String, String> marksheet) {
		this.marksheet = marksheet;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", subjects=" + subjects
				+ ", marksheet=" + marksheet + "]";
	}
	
	
}
