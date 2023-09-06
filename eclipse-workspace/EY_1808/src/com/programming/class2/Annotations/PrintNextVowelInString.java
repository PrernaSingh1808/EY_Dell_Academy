package com.programming.class2.Annotations;
import java.util.HashMap;
import java.util.Arrays;

//a,e,i,o,u

public class PrintNextVowelInString{
	
	public static void main(String[] args) {
		
		String str = "PrernaSingh";
		System.out.println("Next Vowel in String is " + PrintNextVowel(str.toCharArray()));
	}
	
	public static String PrintNextVowel(char[] str) {
		HashMap<Character, Integer> hMap = new HashMap<>();
		hMap.put('a',0);
		hMap.put('e',1);
		hMap.put('i',2);
		hMap.put('o',3);
		hMap.put('u',4);
		
		char[] arr = {'a','e','i','o','u'};
		
		int lengthOfString = str.length;
		
		for(int i=0; i< lengthOfString; i++) {
			char c = str[i];
			
			//If current character is vowel find index in hash and replaces with next vowel from hash itself
			
			if(c=='a' || c=='e' || c=='i'|| c=='o' || c=='u') {
				int index = hMap.get(c)+1;
				int newIndex = index % 5;
				
				str[i] = arr[newIndex];
			}
			
		}
		
		return String.valueOf(str);
		
		
	}
	
	

}
