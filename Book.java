package com.programming.class2;

public class Book  implements Comparable<Book> {
	
	int bookID;
	String author, publisher, name;
	int quantity;
	
	//Constructor
	
	Book(int bookID, String author, String publisher, String name, int quantity){
		this.bookID = bookID;
		this.author = author;
		this.publisher = publisher;
		this.name = name;
		this.quantity = quantity;
		
	}
	
	@Override
	public int compareTo(Book o) {
		if(bookID > o.bookID) {
			return -1;
			
			
		}else if(bookID < o.bookID) {
			return -1;
		}else {
			return 0;
		}
	}

}
