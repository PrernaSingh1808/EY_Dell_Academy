package com.programming.class2;

import java.time.LocalDate;

public class FunctionsOfLocalDateAPI {
	
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println("Year " + today.getYear() + "is a leap year or " + "not" + today.isLeapYear());
		
		
		System.out.println("10 Days after today will be " + today.plusDays(10));
		
		System.out.println("3 weeks after today will be " + today.plusWeeks(3));
		
		System.out.println("20 Months after today will be " + today.plusMonths(20));
		
		
		System.out.println("5 weeks before today will be " + today.minusWeeks(5));
		
		System.out.println("10 Days before today will be " + today.minusDays(10));
		
		System.out.println("20 Months before today will be " + today.minusMonths(20));
		
		
		
	}

}
