package com.interfaces;

public class Opertions implements Calculator {
//	float num1;
//	float num2;
//	float num3;
	
	//For Two Arguments
	public float add(float num1,float num2) {
		return num1+num2;
	}
	
	public float subtract(float num1,float num2) {
		return num1-num2;
	}
	
	public float divide(float num1,float num2) {
		return num1/num2;
	}
	
	public float multiply(float num1,float num2) {
		return num1*num2;
	}
	
	//For 3 Arguments
	public float add(float num1, float num2,float num3) {
		return num1+num2+num3;
	}
	
	public float subtract(float num1, float num2,float num3) {
		return num1-num2-num3;
	}
	
	public float multiply(float num1, float num2,float num3) {
		return num1*num2*num3;
	}
	
	public float divide(float num1, float num2,float num3) {
		return num1/num2/num3;
	}
	
	public void print() {
		System.out.print("Answer Is : ");
	}
	

	public static void main(String[] args) {
		Calculator c = new Opertions();
		c.print();
//		System.out.println(c.add(2.0f,2.5f,2.5f));
//		System.out.println(c.divide(8.0f, 4.0f));
		System.out.println(c.multiply(4.0f, 4.0f, 4.0f));
		
	}
}
