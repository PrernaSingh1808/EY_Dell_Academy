package com.programming.class2;

public class WrapperClass {
	public static void main(String[] args) {
		byte grade = 2;
		short marks = 20;
		float price = 8.3f;
		double rate = 240.2D;
		char initial = 'A';
		
		
		//AutoBoxing
		Byte bObject = new Byte(grade);
		Short sObject = new Short(marks);
		System.out.println("Data Type grade is " + grade);
		System.out.println("Object " + bObject);
		
		byte byteValue = bObject.byteValue(); //UnBoxing
		System.out.println(byteValue);
		
		
		
		
	}

}
