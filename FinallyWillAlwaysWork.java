package com.programming.class2;

public class FinallyWillAlwaysWork {
	
	public static void main(String[] args) {
		int result = sampleMethod();
		System.out.println("Result is " + result);
	}
	
	static int sampleMethod() {
		try {
			return 123;
		}finally {
			System.out.println("Code just returing a integer 123");
		}
	}
}


