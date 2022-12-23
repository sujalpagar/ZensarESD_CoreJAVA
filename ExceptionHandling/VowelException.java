package com.ExceptionHandling;

public class VowelException extends Exception {
	private String msg;
	
	public VowelException(String msg) {
		this.msg = msg;
	}
	
	public String toString() {
		return ""+msg;
	}
}
