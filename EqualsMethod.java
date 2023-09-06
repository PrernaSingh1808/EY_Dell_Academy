package com.programming.class2;

public class EqualsMethod {
	public static void main(String[] args) {
		
		String str1 = "String is a immutable class";
		String str2 = "String is  a immutable class";
		
		if(str1==str2) {
			System.out.println("== works for literals or constants");
		}else {
			System.out.println("== does not works for literals or constanst");
		}
		
		//object
		
		String str3 = new String("String is  a immutable class");
		String str4 = new String("String is  a immutable class");
		
		if(str3==str4) {
			System.out.println("== works for literals or constant");
		}else {
			System.out.println("== does not works for literals or constant");
			
		}
		
		if(str3.equals(str4)) {
			System.out.println("equals works with OBJECTS");
		}
		
		
	}

}
