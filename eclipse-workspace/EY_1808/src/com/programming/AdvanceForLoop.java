package com.programming;

public class AdvanceForLoop {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,54,78};
		
		for(int data : intArr) {
			System.out.print(data + " ");
		}
		System.out.println();
		String[] strArr = {"2", "A", "X", "B"};
		
		for(String str: strArr) {
			System.out.print(str + " ");
		}
	}

}
