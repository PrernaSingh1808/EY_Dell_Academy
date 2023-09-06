package com.programming.class2;

public class NumberInitialization {
	int number1;
	static int number2;
	
	static {
		System.out.println("Static Initializer");
		number2 = 100;
		
	}
	
	NumberInitialization(){
		number1 = 67;
		
	}
	public static void main(String[] args) {
		System.out.println("Main method");
		
		System.out.println("The value of number2 is: " + number2);
		
		NumberInitialization obj = new NumberInitialization();
		System.out.println("The value of number1 is " + obj.number1);
	}

}
