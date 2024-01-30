package com.springcore.addition;

/**
 * Spring takes constructor argument value as String 
 * and detects the first constructor in the class, 
 * converts the string values into that constructor argument's type. 
 * But if a String constructor is present at any position 
 * in the class then it calls the String constructor only. 
 * This happens only when the "type" is not specifies in 
 * "constructor-args" in the xml configuration file
 */

public class Addition {
	
	private int num1;
	private int num2;
	private int sum;
	
	public Addition(double num1, double num2) {
		System.out.println("The constructor called has double type parameters");
		this.num1 = (int) num1;
		this.num2 = (int) num2;
	}
	
	public Addition(int num1, int num2) {
		System.out.println("The constructor called has integer type parameters");
		this.num1 = num1;
		this.num2 = num2;
	}
	
//	public Addition(String num1, String num2) {
//		System.out.println("The constructor called has string type parameters");
//		this.num1 = Integer.parseInt(num1);
//		this.num2 = Integer.parseInt(num2);
//	}
	
	public void sum() {
		System.out.println(num1+num2);
	}
	
	@Override
	public String toString() {
		return "Addition [num1=" + num1 + ", num2=" + num2 + ", sum=" + sum + "]";
	}
	
}
