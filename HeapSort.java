package com.programming.class2;

public class HeapSort {

	public static void main(String[] args) {

		int[] intArr = { 3, 60, 35, 2, 54, 456 };

		System.out.println("Before Heap Sort: ");
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i] + " ");

		}

		HeapSort.heapSort(intArr);
		System.out.println();

		System.out.println("After Heap Sort: ");
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i] + " ");

		}

	}

	static void heapSort(int[] intArr) {
		int lenghtOfArray = intArr.length;
		for (int i = lenghtOfArray / 2 - 1; i >= 0; i--) {
			heapify(intArr, lenghtOfArray, i);
		}

		for (int i = lenghtOfArray - 1; i >= 0; i--) {

			// move current root element to end and swap intArr[0] with intArr[length-1]
			int temp = intArr[0];
			intArr[0] = intArr[i];
			intArr[i] = temp;

			heapify(intArr, i, 0);
		}
	}

	// Remove the root element repeatedly by shifting to the end of the array then
	// store heap with remaining elements
	// Heap is a complete binary tree and binary tree

	static void heapify(int[] intArr, int lengthOfArray, int i) {
		int largestElement = i;
		int left = 2 * i + 1;
		int right = 2 * 1 + 2;

		if (left < lengthOfArray && intArr[left] > intArr[largestElement]) {
			largestElement = left;

		}
		if (right < lengthOfArray && intArr[right] > intArr[largestElement]) {
			largestElement = right;

		}

		if (largestElement != i) {

			int tempArr = intArr[i];
			intArr[i] = intArr[largestElement];
			intArr[largestElement] = tempArr;

			heapify(intArr, lengthOfArray, largestElement);

		}
	}
}
