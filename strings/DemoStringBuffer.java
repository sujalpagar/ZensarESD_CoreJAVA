package com.strings;

public class DemoStringBuffer {
	public static void main(String args[]) {
		String s1 = "Sujal";
		String s2 = "Sujal";
		
		if(s1 == s2) {
			System.out.println("same location");
		}else {
			System.out.println("different location");
		}
		
		if(s1.equals(s2)) {
			System.out.println("same content");
		}else {
			System.out.println("different content");
		}
		
		
		String p1 = new String("java");
		String p2 = new String("java");
		
		if(p1 == p2) {
			System.out.println("same location");
		}else {
			System.out.println("different location");
		}
		
		if(p1.equals(p2)) {
			System.out.println("same content");
		}else {
			System.out.println("different content");
		}
		
		
		StringBuffer sb = new StringBuffer("dyp");
		StringBuffer sb1 = new StringBuffer("dyp");
		
		if(sb == sb1) {
			System.out.println("same location");
		}else {
			System.out.println("different location");
		}
		
		if(sb.equals(sb1)) {
			System.out.println("same content");
		}else {
			System.out.println("different content");
		}
		
		//compare content Stringbuffer

		System.out.println(sb.toString().equals(sb1.toString()));	
		
	}
}
