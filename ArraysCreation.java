package com.programming;

public class ArraysCreation {
	
	public static void main(String[] args) {
		
		//declaration - instantiation - 
		
		int[] intArr = new int[6];
		
		//initialization
		intArr[0] = 10;
		intArr[1] = 60;
		intArr[2] = 20;
		intArr[3] = 45;
		intArr[4] = 15;
		intArr[5] = 10;
		
		//declaration, instantiated and initialized
		String[] strArr = {"Z", "A", "X", "B", "D"};
		
		//traverse
		for(int i=0; i<= intArr.length -1; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		
		for(int i =0; i<strArr.length; i++) {
			System.out.print(strArr[i]+ " ");
		}
		System.out.println();
		
		for(int i: intArr) {
			System.out.print(i + " ");
		}
	}

}
