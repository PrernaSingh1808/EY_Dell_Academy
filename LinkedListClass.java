package com.programming.class2;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListClass {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("A");list.add("A");list.add("A");list.add("A");
		
		//any no of null is allowed
		list.add(null);list.add(null);list.add(null);
		
		list.add("P");list.add("Q");list.add("R");list.add("S");
		
		list.addFirst("First Element");
		list.addLast("Last Element");

		
		Object firstElement = list.getLast();
		System.out.println("First Element is " + firstElement);
		

		Object lastElement = list.getLast();
		System.out.println("Last Element is " + lastElement);
		
		
		int position = list.indexOf("P");
		System.out.println("Positon of P " + position);
		
		int lastPositionOfA = list.lastIndexOf("A");
		System.out.println("Position of last A: " + lastPositionOfA);
		
		list.add(0, "Added element at the zeroth index");
		list.remove(2); //removed element from second index
		
		
		list.removeFirst();
		list.removeLast();
		
		list.removeFirstOccurrence("A");
		list.removeLastOccurrence("A");
		
		Object o = list.poll(); //returns and remove first item from the list
		Object o2 = list.pollLast(); //returns and remove last element from the list
		
		
	//	Iterator<String> itr = list.iterator();
		//while(itr.hasNext()) {
			//System.out.println(itr.next() + " ");
		
		ListIterator<String> listItr = list.listIterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next() + " ");
		}
		
		System.out.println();
		while(listItr.hasNext()) {
			System.out.println(listItr.previous() + " ");
		}
		
		
	}

}
