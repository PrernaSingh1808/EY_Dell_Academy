package com.programming;

public class SelectionStmt1 {
	public static void main(String[] agrs) {
		int marks = 85;
		if(marks < 100 && marks > 90) {
			System.out.println("Excellent Grade and mark is " + marks);
		}else if(marks <90 && marks > 80) {
			System.out.println("Very Good Grade");
		}else {
			System.out.println("Unknown Result");
		}
		int number = 15;
		
		if ( number % 2 == 0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
	}

}

