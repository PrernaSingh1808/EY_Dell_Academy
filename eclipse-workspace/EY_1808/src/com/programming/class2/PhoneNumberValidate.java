package com.programming.class2;

import java.util.regex.Pattern;


public class PhoneNumberValidate {
	
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","abcd34"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","abcd347"));
		
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}","9898989999"));
	}

}
