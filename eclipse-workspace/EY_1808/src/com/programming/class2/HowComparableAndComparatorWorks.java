package com.programming.class2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class HowComparableAndComparatorWorks {
	
	public static void main(String[] args) {
		
		int[] intArr =  {10,2,83,103,1,3,4};
		Arrays.sort(intArr);
		System.out.println("Sorted interger Arrays is: " + Arrays.toString(intArr));
		
		String[] strArr = {"Z","A","X","B", "W"};
		Arrays.sort(strArr);
		System.out.println("Sorted String is " + Arrays.toString(strArr));
		
		List<String> listStr = new ArrayList<>();
		listStr.add("Z"); listStr.add("A"); listStr.add("Z"); listStr.add("Z");
		Collections.sort(listStr);

        for(String str : listStr)

        {

            System.out.print(str+" ");

        }
		
		
	
	}

}
