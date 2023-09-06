package com.programming.class2;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListForBookClass {
	
	public static void main(String[] args) {
		ArrayList<Book> arrList = new ArrayList<>();
		
		Book b1 = new Book(1, "A", "B", "C", 10);
		Book b2 = new Book(17, "P", "Q", "R", 100);
		Book b3 = new Book(11, "M", "N", "O", 120);
		
		
		arrList.add(b1);arrList.add(b1);arrList.add(b1);
		arrList.add(b3);arrList.add(b2);arrList.add(b2);
		
		for(Book b: arrList) {
			System.out.println(b.bookID + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity );
			
		}
		
		Iterator<Book> itr = arrList.iterator();
		while(itr.hasNext()){   
			Book b = itr.next();
			System.out.println(b.bookID + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity );
		}
		
	}

}
