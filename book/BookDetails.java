package com.book;
import java.util.*;

import com.inheritance.Employee;

public abstract class BookDetails {
	protected int bId;
	protected String bName;
    protected float bPrice;
	protected Date bPDate;  //publish date
	protected Author bAuthor;
	
	BookDetails(int bId,String bName,float bPrice,Date bPDate,Author bAuthor){
		this.bId = bId;
		this.bName = bName;
		this.bPrice = bPrice;
		this.bPDate = bPDate;
		this.bAuthor = bAuthor;
	}
	
	public float getBookPrice() {
		return this.bPrice;
	}
	
	public void setBookPrice(float bPrice) {
		this.bPrice = bPrice;
	}
	
	public abstract float calBookPrice();
	
	public abstract void calDiscount();
}

class Novel extends BookDetails{

	public Novel(int bId,float bPrice,String bName,Date bPDate,Author bAuthor) {
		super(bId, bName,bPrice, bPDate, bAuthor);
		this.bPrice = bPrice;
	}
	
	public float calBookPrice() {
		return this.bPrice;
	}
	
	public void calDiscount() {
		int pYear = bPDate.getYy();
		if(pYear >= 5) {
			float discount = this.getBookPrice() / 5;
			this.setBookPrice(getBookPrice()-discount);
			System.out.println("Total Discount Is : "+discount);
		}else {
			System.out.println("Discount is No Applicable.");
		}
	}
}
class Comic extends BookDetails{

	public Comic(int bId,float bPrice,String bName,Date bPDate,Author bAuthor) {
		super(bId, bName,bPrice, bPDate, bAuthor);
		this.bPrice = bPrice;
	}
//	protected float bPrice;
	
	public void calDiscount() {
		int pYear = bPDate.getYy();
		if(pYear >= 3) {
			float discount = this.getBookPrice() / 3;
			this.setBookPrice(getBookPrice()-discount);
			System.out.println("Total Discount Is : "+discount);
		}else {
			System.out.println("Discount is No Applicable.");
		}
	}
	
	public float calBookPrice() {
		return this.bPrice;
	}
}

class ShopKeeper{
	public void bookPrice(BookDetails b) {
		System.out.println("Total Book Price Is : "+b.bPrice);
	}
	public void calDiscount(BookDetails b) {
		System.out.println("Total Discount Is : ");
		b.calDiscount();
	}
	
	public static void main(String args[]) {
		ShopKeeper s = new ShopKeeper();
		System.out.print("Enter Book Type Comic or Novel : ");
		Scanner sc = new Scanner(System.in);
		BookDetails b = null;
		String bookname = sc.next();
		if(bookname.equals("Comic")||bookname.equals("comic")||bookname.equals("COMIC")) {
			b = new Comic(12,122.4f,"Let Us C",new Date(10,07,2016),new Author("yashvant",44));
			s.calDiscount(b);
			s.bookPrice(b);
			
		}
		if(bookname.equals("Novel")||bookname.equals("novel")||bookname.equals("NOVEL")) {
			b = new Novel(19,199.9f,"xyz",new Date(1,12,2019),new Author("abc",7));
			s.calDiscount(b);
			s.bookPrice(b);
		}
	}
}


