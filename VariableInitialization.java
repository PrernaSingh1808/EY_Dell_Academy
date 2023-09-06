package com.programming;

public class VariableInitialization {
	int number;
	
	//No Arg
	VariableInitialization(){
		number = 100;
	}
	
	
	//parameterized constructor
	VariableInitialization(int number){
		this.number = number;   //this keyword resolves the ambiguity b/w non-static instance variable and method parameter   
	}
	
	public static void main(String[] args) {
		VariableInitialization obj = new VariableInitialization();
		System.out.println("The value of number is " +obj.number);
		
		VariableInitialization obj2 = new VariableInitialization(1000);
		System.out.println("The value of numver is " + obj2.number);
	}
	

}
