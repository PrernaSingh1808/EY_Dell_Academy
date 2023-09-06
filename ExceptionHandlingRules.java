package com.programming.class2;

import java.sql.SQLException;

class Parent 
{
	
	void show() throws SQLException{
		System.out.println("Parent class Method");
	}
}

public class ExceptionHandlingRules extends Parent{
	@Override
	void show() throws Exception{
		System.out.println("Child class Method");
	}
	public static void main(String[] args) {
		
		
		
	}

}
