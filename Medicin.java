package com;

public class Medicin {
	private int id;
	private String name;
	private float price;
	private AccountDate mfgdate;
	
	//constructor 
	public Medicin(int id, String name, float price, AccountDate mfgdate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.mfgdate = mfgdate;
	}
	
	public void Expdetail() {
		int year = 2022 - mfgdate.getYy();
		
		if(year >= 5) {
			System.out.println("Product is Expired");
		}
	}
	
	
	
	public static void main(String args[]) {
		Medicin m1 = new Medicin(13144,"nicip",40.2f,new AccountDate(10,07,2019));
	}
}
