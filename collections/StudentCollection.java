package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentCollection {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		ArrayList arr = new ArrayList<>();
		
		arr.add(new StudentOperation(13144, "Sujal", 25));
		arr.add(new StudentOperation(13112, "Pranav", 27));
		arr.add(new StudentOperation(13140, "Prince", 39));
		arr.add(new StudentOperation(13108, "Rohit", 12));
		arr.add(new StudentOperation(13173, "Prait", 29));
		
		
		Collections.sort(arr);
		System.out.println(arr);
		
//		if(arr.contains(new StudentOperation(13112, "Prait", 29))) {
//			System.out.println("Student Found");   
//			arr.remove(new StudentOperation(13112, "Prait", 29));
//		}else {
//			System.out.println("Student Not Found");
//		}
		
		
		//Comparator Operator
		
//		Comparator<StudentOperation> so = new Comparator<StudentOperation>() {
//			
//			@Override
//			public int compare(StudentOperation o1, StudentOperation o2) {
//				if(o1.getStdRollNo() > o2.getStdRollNo()) {
//					return 1;
//				}
//				else if(o1.getStdRollNo() < o2.getStdRollNo()) {
//					return -1;
//				}
//				else {
//					return 0;
//				}
//			}
//		};
		
//		Collections.sort(arr,so);
//		System.out.println(arr);
		
	}
}
