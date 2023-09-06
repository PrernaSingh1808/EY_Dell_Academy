package com.programming;

public class StringAsAImmutableClass {
	
	public static void main(String[] args) {
		String str = new String("ABC");
		System.out.println("1 - Value of str is " + str);
		str.concat("XYZ");
		System.out.println("2 - Value of str is " + str);
		str.replace("A", "X");
		System.out.println("3 - Value of str is " + str);
		str.concat("PQR");
		System.out.println("4 - Value of str is " + str);
		
		
		// jdk 1.1 - synchronized -- threat safe
		
		StringBuffer sb = new StringBuffer("ABC");
		System.out.println("5 - Value of str is " + sb.toString());
		sb.append("XYZ");
		System.out.println("6 - Value of str is " + sb.toString());
		
		
		//jdk 1.5 - fast
		
		StringBuilder sb2 = new StringBuilder("MNO");
		System.out.println("5 - Value of str is " + sb2.toString());
		sb2.append("XYZ");
		System.out.println("6 - Value of str is " + sb2.toString());
		
	}

}
