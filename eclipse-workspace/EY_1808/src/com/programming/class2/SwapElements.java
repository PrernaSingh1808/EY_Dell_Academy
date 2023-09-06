package com.programming.class2;

public class SwapElements {
	
	public static void main(String[] args) {
		
		int[] intArr = {20, 2, 5, -3, 100, 0, -1};
		System.out.println("Elements before swapping: ");
		for (int i : intArr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		//Lets say we want to swap elements at 4th index with 2ndd index
		
		int firstIndex = 2, secondIndex =4;
		
		//Temp variable
		int temp = intArr[firstIndex];
		
		//swapping
		intArr[firstIndex] = intArr[secondIndex];
		intArr[secondIndex] = temp;
		
		System.out.println("Elements after swapping 4th index value with 2nd index: ");
		for(int i: intArr) {
			System.out.print(i + " ");
		}
	}

}
