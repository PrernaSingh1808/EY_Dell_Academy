package com.programming;

import java.util.Arrays;


public class SortedArrays {
	
	public static void main(String[] args) {
		
		int[] intArr = {10,9,7,98,3,2};
		
		Arrays.sort(intArr);
		System.out.println("Sorted Arrays is " + Arrays.toString(intArr));
		
		String[] strArr = {"Z","A","X","B","W"};
		Arrays.sort(strArr);
		System.out.println("Sorted Arrays is " + Arrays.toString(strArr));
		
	}

}
