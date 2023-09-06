package com.programming.class2;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
	public static void main(String[] args) {
		LinkedHashMap<Integer, Book> hMap = new LinkedHashMap<>();
		
		Book b1 = new Book(1, "A", "B", "C", 10);
		Book b2 = new Book(12, "P", "Q", "R", 100);
		Book b3 = new Book(13, "M", "N", "O", 1800);
		
		
		hMap.put(123, b3);
		hMap.put(135,b2);
		hMap.put(121, b3);
		
		
		for(Map.Entry<Integer, Book> m: hMap.entrySet()) {
			int key = m.getKey();
			Book b = m.getValue();
			System.out.println("Key " +  key  + "Details are: ");
			System.out.println(b.bookID+ " " +  b.name + " " +  b.publisher + " " +  b.author + " " +    b.quantity);
		}
		
	}

}
