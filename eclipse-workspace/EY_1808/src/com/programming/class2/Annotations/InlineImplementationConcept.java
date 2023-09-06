package com.programming.class2.Annotations;

@FunctionalInterface
interface Sample{
	String print(String name);
	
}

public class InlineImplementationConcept {
	
	public static void main(String[] args) {
		Sample obj = (xyz) -> { return "Welcome" + xyz; }; 
		
		
		System.out.println(obj.print("To Lambda Expression Programming."));
	}

}
