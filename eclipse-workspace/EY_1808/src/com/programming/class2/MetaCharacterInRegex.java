package com.programming.class2;

import java.util.regex.Pattern;

//\d - Any Digit
//\D - Any non Digit
// [^0-6] - Anything other than 0 to 5

public class MetaCharacterInRegex {
	
	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("\\d", "abc")); 
		System.out.println(Pattern.matches("\\d", "1")); 
		
		System.out.println(Pattern.matches("\\d", "1234")); 
		System.out.println(Pattern.matches("\\d*", "1234")); 
		
		
		System.out.println(Pattern.matches("\\D", "a")); 
		System.out.println(Pattern.matches("\\D", "abc")); 
		System.out.println(Pattern.matches("\\D", "123")); 
		
		System.out.println("Core Java  Regex".replaceAll("\\s", ""));
	}

}
