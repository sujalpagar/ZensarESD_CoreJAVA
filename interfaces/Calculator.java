package com.interfaces;

public interface Calculator extends Printable
{	
	//For two Arguments
	public float add(float num1,float num2);
	public float subtract(float num1,float num2);
	public float divide(float num1,float num2);
	public float multiply(float num1,float num2);
	
    //For Three Arguments
	public float add(float num1,float num2,float num3);
	public float subtract(float num1,float num2,float num3);
	public float divide(float num1,float num2,float num3);
	public float multiply(float num1,float num2,float num3);
}
