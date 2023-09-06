package com.programming;

import java.util.Arrays;

public class ArraysComparison {
	
	//int[] intArr1 = {1,2};
	//int[] intArr2 = {1,2};
	
	//boolean[] blnArr1 = { true, false};
	//boolean[] blnArr2 = { true, true};
	
	//if(intArr1 == intArr2 ) {
		//System.out.println("== works for Arrays");
		//}else {
			//System.out.println("== does not works for Arrays");
		//}
	
//	if(blnArr1 == blnArr2) {
	//	System.out.println("== works for Arrays");
	//}
	public static void main(String[] args) {

	    int[] arr1= {1,2};

	    int[] arr2= {1,2};

	    boolean[] b1= {true,false};

	    boolean[] b2= {true,false};

	    boolean result1 = Arrays.equals(arr1, arr2);

	    boolean result2 = Arrays.equals(b1, b2);

	    System.out.println("Output is : "+result1);

	    System.out.println("Output is : "+result2);

	 

	}

}
