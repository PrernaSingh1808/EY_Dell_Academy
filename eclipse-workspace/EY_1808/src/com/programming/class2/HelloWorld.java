package com.programming.class2;


//Time Complexity is instead of
public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("hello world");
		display();
		
	}
	
	static void display() {
		
		int n = 8;
		for(int i =0; i<n; i++) {
			System.out.println("Hello World !!!");
		}
		
		for(int i = 1; i<n; i=i*2) {
			System.out.println("Hello World\n");
		}
		
		for(int i=2; i<n; i=(int)Math.pow(i, 2)) {
			System.out.println("Hello World\n");
			
			
		}
	}
	
	

}
