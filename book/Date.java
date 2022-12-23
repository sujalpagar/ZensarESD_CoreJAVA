package com.book;

public class Date {
	protected int dd;
	protected int mm;
	protected int yy;
	
	//Constructor
	public Date(int dd,int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	
	//Setter
	public void setDd(int dd) {
		this.dd = dd;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	
	//Getter 
	public int getDd() {
		return dd;
	}
	public int getMm() {
		return dd;
	}
	public int getYy() {
		return yy;
	}
	
	//toString
	public String toString() {
		return "Book Published At : "+this.dd+"/"+this.mm+"/"+this.yy;
	}
}
