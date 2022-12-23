package com.ExceptionHandling;

public class ConsonentException extends Exception {
	private String msg;
	
	public ConsonentException(String msg) {
		this.msg = msg;
	}
	
	public String toString() {
		return ""+msg;
	}
}
