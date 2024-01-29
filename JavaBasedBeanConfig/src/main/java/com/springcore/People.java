package com.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) { }

record Address(String street, String city) { }

@Configuration
public class People {
	
	@Bean
	public Person person() {
		return new Person("Nikita", 22);
	}
	
	@Bean("Permanent address")
	public Address address() {
		return new Address("Baker street", "London");
	}
}
