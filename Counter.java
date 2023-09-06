package com.programming.class2;

public class Counter {
static int counter;
	Counter(){
		counter++;
		System.out.println("Value of count is " + counter);
	}
	
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		
	}
	

}
