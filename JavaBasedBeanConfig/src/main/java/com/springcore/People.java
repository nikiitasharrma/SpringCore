package com.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) { }

record Address(String street, String city) { }

@Configuration
public class People {
	
	@Bean
	public String name() {
		return "Nikita";
	}
	
	@Bean
	public int age() {
		return 22;
	}
	
	@Bean
	public Person person() {
		return new Person("Aman", 21, new Address("Main street", "Madrid"));
	}
	
	@Bean("Person2")
	public Person personMethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean("Person3")
	public Person personParameterized(String name, int age, Address address) {
		return new Person(name, age, address);
	}
	
	@Bean
	public Address address() {
		return new Address("Baker street", "London");
	}
}
