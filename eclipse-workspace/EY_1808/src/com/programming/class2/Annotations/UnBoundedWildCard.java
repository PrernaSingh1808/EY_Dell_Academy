package com.programming.class2.Annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class UnBoundedWildCard {
	
	public static void main(String[] args) {
		UnBoundedWildCard obj = new UnBoundedWildCard();
		List<String> listStr = new ArrayList<>();
		listStr.add("ABC");
		listStr.add("XYZ");
		obj.printCollectionData(listStr);

	}
	
	void printCollectionData(Collection<?> objToPrint) {
		System.out.println("[");
		for(Object obj: objToPrint) {
			System.out.println(obj.getClass().getCanonicalName() + " : " + obj);
			
		}
		
		System.out.print("]");
		System.out.println();
	}

}
