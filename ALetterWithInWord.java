package com.programming.class2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ALetterWithInWord {
	
	private static final String REGEX = "\\bA\\b";
	private static final String INPUT_STRING = "A A AB A";
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT_STRING);
		
		int count = 0;
		
		while(m.find()) {
			
			count++;
			
			System.out.println("Match Number - " + count);
			System.out.println("Starting Index - " + m.start());
			
			//Index or position or offset after the character matches.
			System.out.println("Ending Position " + m.end());
			
		}
	}

}
