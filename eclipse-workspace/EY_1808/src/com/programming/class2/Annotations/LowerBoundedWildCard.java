package com.programming.class2.Annotations;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildCard {
	public static void main(String[] args) {
		List<Integer> listInt = new ArrayList<Integer>();
		listInt.add(123);
		listInt.add(456);
		listInt.add(765);
		printListItem(listInt);
		
		List<Number> listfloat = new ArrayList<Number>();
		listfloat.add(14L);
		listfloat.add(3.14);
		listfloat.add(21L);
		printListItem(listfloat);
		
		
		List<Double> listDouble = new ArrayList<Double>();
		listDouble.add(11.1D);
		listDouble.add(33.1D);
		//printListItem(listDouble);
		
	}
	
	static void printListItem(List<? super Integer> list) {
		for(Object num : list) {
			System.out.println(num);
		}
	}

}
