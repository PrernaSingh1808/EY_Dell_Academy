package com.programming.class2;

import java.util.ArrayList;
import java.util.Iterator;


public class HowArrayListWorks {
	
	public static void main(String[] args) {
		
		//Insertion Order = maintained
				//Duplicates are allowed 
		ArrayList<String> arrList = new ArrayList<>();
		
		arrList.add("A"); arrList.add("A");arrList.add("A");arrList.add("A");
		
		//any number of null is allowed
		arrList.add(null);arrList.add(null);arrList.add(null);
		
		arrList.add("Z"); arrList.add("X");arrList.add("Y");arrList.add("B");
		
		
		ArrayList<String> arrList2 = new ArrayList<>();
		arrList2.add("P");arrList2.add("Q");arrList2.add("R");
		
		//adding second array list in first array list
		
		arrList.addAll(arrList2);
		
		//size of the arrayList
		System.out.println("Size of the array List: " + arrList2.size());
		
		//removing fist A
		arrList.remove("A");
		
		//Removing second arrayList from first arrayList
		arrList.removeAll(arrList2);
		//Updating the element at first index in the arrayList
		arrList.set(1,  "New Second Element");
		
		//removing all elements from first arrayList and keeping all the elements of second array list
		
		//arrList.retainAll(arrList2);
		
		
		//Updating the element at the first index in the arrList
		arrList.set(1,"Update");
		
		Iterator<String> itr = arrList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
		
		//In the end, u clear your entire ArrayList
		
		arrList.clear();
		

	}

}
