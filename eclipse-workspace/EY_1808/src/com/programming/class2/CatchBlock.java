package com.programming.class2;

public class CatchBlock {
	
	public static void main(String[] args) {
		try {
			
		}catch(NullPointerException | ArithmeticException | IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			
		}
	}

}
