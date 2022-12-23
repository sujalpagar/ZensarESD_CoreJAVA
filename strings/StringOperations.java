package com.strings;

public class StringOperations {
	static int count = 0;
	public static void main(String args[]) {
		String str = "Java Is a Object Oriented Programming Language";
		
		//separate word from string
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		//remove space 
		 String spaceremove = str.replaceAll("\s", "");
		 System.out.println(spaceremove);
		 
		 //occurance 'o'
		 for(int i=0; i<str.length(); i++) {
			 if(str.charAt(i)=='O') {
				 count++;
			 }
		 }
		 System.out.println(count);
		 
		 
		 //String to array alphabet
		 System.out.print("[");
		 for(int i=0; i<str.length(); i++) {
			 System.out.print("'"+str.charAt(i)+"'"+",");
		 }
		 System.out.print("]");
		 
	}
}
