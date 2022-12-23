package com.ExceptionHandling;

public class OddNumberException extends Exception {
	private String msg;
	
	public OddNumberException(String msg) {
		this.msg = msg;
	}
	
	public String toString() {
		return ""+msg;
	}
}
