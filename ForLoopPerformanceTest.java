package com.programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;


public class ForLoopPerformanceTest {

	static List<Integer> list = new ArrayList<> ();
	static long startTime, endTime;
	
	static {
		for(int i=0; i < 100_000_00; i++) {
			list.add(i); //prepare the data
		}
	}
	
	public static void main(String[] agrs) {
		startTime = Calendar.getInstance().getTimeInMillis();
		for(Integer i : list) {};
		endTime = Calendar.getInstance().getTimeInMillis();
		System.out.println("Advanced For Loop = " + (endTime - startTime ) + "ms");
		
		startTime = Calendar.getInstance().getTimeInMillis();
		for(int i=0; i<list.size(); i++) {}
		endTime = Calendar.getInstance().getTimeInMillis();
		System.out.println("Basic For Loop -size - took = " + (endTime - startTime ) + "ms");
		
		startTime = Calendar.getInstance(),getTimeInMillis();
		int size = list.size();
		for(int i=o; i<= size; i++) {}
		
		
		System.out.println("Basic for loop - size calculated prior - " + (endTime - startTime ) + "ms");
		
		startTime = C
		for(int i =size; i>0; i--)()
		
		
		Sys
	}
}
