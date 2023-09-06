package com.programming.class2;

public final class FinalKeyword {
	
	final static String Pan_Card_Number;
	
	/*
	 * FinalKeyword(){ Pan_Card_Number = "ABCE34456";}
	 */
	static {
		Pan_Card_Number = "ABCE34456";
	}
	
	final void display() {
		System.out.println("Final Method");
	}
	
	public static void main(String[] args) {
		
		FinalKeyword obj = new FinalKeyword();
		System.out.println("obj is " + obj.Pan_Card_Number);
	}
	

}


