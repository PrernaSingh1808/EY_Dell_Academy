package com.programming.class2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterClass {
	
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println("Default Format is " + today);
		
		System.out.println("According to Pattern 1 " + today.format(DateTimeFormatter.ofPattern("d::MM::uuuu")));
		
		System.out.println("According to Pattern 2 " + today.format(DateTimeFormatter.BASIC_ISO_DATE));
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println("Current Date wuth timestamp is: " + dateTime);
		System.out.println("According to Pattern 2 " + dateTime.format(DateTimeFormatter.ofPattern("dd::MMM::uuuu HH::mm::ss")));
				
	}

}
