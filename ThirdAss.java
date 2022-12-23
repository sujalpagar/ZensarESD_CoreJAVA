package com;

public class ThirdAss {
//Abstraction
	private int dd;
	private int mm;
	private long yyyy;
	
// Constructor
	public ThirdAss(int dd,int mm, long yyyy) {
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	
// Setter Method
	public void setDd(int dd) {
		this.dd = dd;
	}
	
	public void setMm(int mm) {
		this.mm = mm;
	}
	
	public void setDd(long yyyy) {
		this.yyyy = yyyy;
	}
	
// Getter Method
	public int getDd() {
		return this.dd;
	}
	
	public int getMm() {
		return this.mm;
	}
	
	public long getYyyy() {
		return this.yyyy;
	}

// toString Method
	public String toString() {
		return ("Date is "+dd+"/"+mm+"/"+yyyy);
	}
	
// Facilitetor Method
	public void display() {
		System.out.println("\nDate Is : "+dd+"/"+mm+"/"+yyyy);
	}
	
// Business Logic 
	
	
// Entrypoint Method
	public static void main(String args[]) {
		ThirdAss datetime = new ThirdAss(10,07,2002);
		System.out.println(datetime.getYyyy());
		System.out.println(datetime);
	}

}
