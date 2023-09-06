package com.programming.class2;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDatTimeClassConcept {
	
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Current System Date is " + today);
		
		LocalDate indiaDate = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current India Date is " + indiaDate);
		
		
		LocalDate usDate = LocalDate.now(ZoneId.of("US/Central"));
		System.out.println("Current Us Date is " + usDate);
		
		LocalDate firstDay2023 = LocalDate.of(2023, Month.JANUARY,1);
		System.out.println("First Day of 2023 is " + firstDay2023);
		
		//Now date Time exception will come
		//LocalDate feb29_2023 = LocalDate.of(2023,Month.FEBRUARY, 29);
		//System.out.println("February Month last day is " + feb29_2023);
		
		LocalDate epochDay = LocalDate.ofEpochDay(1000);
		System.out.println("1000 day from Epoch Date is: " + epochDay);
		
		LocalDate Hunderdth_Day_of_2020 = LocalDate.ofYearDay(2020, 100);
		System.out.println("100th day from Epoch Date is" + Hunderdth_Day_of_2020);
		
	}

}
