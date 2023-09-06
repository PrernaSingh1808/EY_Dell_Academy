package com.programming.class2;

import java.util.regex.Pattern;

//[abc] - a or b or c

public class CharacterClassInRegex {
	
	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[amn]","a"));
		System.out.println(Pattern.matches("[amn]","aa"));
		System.out.println(Pattern.matches("[amn]","m"));
		System.out.println(Pattern.matches("[amn]","mm"));
		
		System.out.println(Pattern.matches("[^amn]","z"));
		System.out.println(Pattern.matches("[a-zA-Z]","B"));
		System.out.println(Pattern.matches("[a-d[m-p]]","e"));
		
	}

}
