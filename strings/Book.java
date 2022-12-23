package com.strings;

public class Book {
	public String b1;
	public String b2;
	public static void Book(String book11, String book22) {
		b1 = book1;
		b2 = book2;
		
	}
	
	public static void swap(String book, String book2){  
	      String temp = book; 
	      book = book2;
	      book2 = temp;
	      
	      System.out.println("book 1 is : " +book);
	      System.out.println();
	      System.out.println("book 2 is : " + book2);
	      
	    
	    }  
	public static void main(String args[]) {
		
		
		String b1 ="Although in most countries printed books continue to outsell their digital counterparts due to many people still preferring to read in a traditional way.";
		String b2 ="As an intellectual object, a book is prototypically a composition of such great length that it takes a considerable investment of time to compose and still considered as an investment of time to read.";

		Book(b1,b2);
		
	}

	
}
