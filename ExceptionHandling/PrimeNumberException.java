package com.ExceptionHandling;

public class PrimeNumberException extends Exception  {
	private String msg;
	
	public PrimeNumberException(String msg) {
		this.msg = msg;
	}
	
	public String toString() {
		return ""+msg;
	}
}
