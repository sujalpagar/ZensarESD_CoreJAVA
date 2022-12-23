package com;
import java.util.Scanner;

public class GetOutput {
	
	public static void print(int data) {
		System.out.println(data);
	}
	
	public static void print(float data) {
		System.out.println(data);
	}
	
	public static void print(String data) {
		System.out.println(data);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose Option :\nInterger Click(1)\nFloat Click(2)\nString Click(3):");
		int click = sc.nextInt();
		
		if(click == 1) {
			System.out.println("Enter Data : ");
			int data = sc.nextInt();
			print(data);
		}
		else if(click == 2) {
			System.out.println("Enter Data : ");
			float data = sc.nextFloat();
			print(data);
		}
		else if(click == 3) {
			System.out.println("Enter Data : ");
			String data = sc.next();
			print(data);
		}
		
	}

}
