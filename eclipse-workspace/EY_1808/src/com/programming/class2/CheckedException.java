package com.programming.class2;

import java.io.BufferedReader;  //to read character 
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;



public class CheckedException {
	
	public static void main(String[] args) {
		
		// read the character data
		
		BufferedReader br = null;
		Reader r = new InputStreamReader(System.in);
		br = new BufferedReader(r);
		
		String str;
		try {
			do {
				System.out.println("Please enter sth, I will write it 4 u");
				str = br.readLine();
				System.out.println("What u have entered is " + str);
				
			}while (!str.equalsIgnoreCase("exit"));
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(br != null) {
				try {
					br.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
