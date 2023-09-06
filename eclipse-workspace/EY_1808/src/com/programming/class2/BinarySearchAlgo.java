package com.programming.class2;

import java.util.Arrays;

//Search given key from multiple element
//faster in performance than linear search


public class BinarySearchAlgo {
	
	public static void main(String[] args) {
		int[] intArr = {10,12,325,67,8,3};
		Arrays.sort(intArr);
		System.out.println("Sorted Array is: " + Arrays.toString(intArr));
		int lookOutfor = 67;
		int LastElementPositionInArray = intArr.length -1;
		
		binarySearch(intArr,0, LastElementPositionInArray, lookOutfor);
		
	}
	
	//In Binary Search , it is mandatory to sort element before searching
	static void binarySearch(int[] intArr, int startingPosition,
			int lastPosition, int searchElement) {
		
		int midElementPosition = (startingPosition + lastPosition)/2;
		while(startingPosition <= lastPosition) {
			if (intArr[midElementPosition] <searchElement) {
				startingPosition = midElementPosition+1;
				
				
			}else if(intArr[midElementPosition] == searchElement){
				System.out.println("Element found at position " + midElementPosition);
				break;
			}else {
				lastPosition = midElementPosition -1;
			}
			midElementPosition = (startingPosition + lastPosition)/2;
		}
		if(startingPosition > lastPosition) {
			System.out.println("Element is not founf!");
		}
	}
	

}
