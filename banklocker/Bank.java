package com.banklocker;

import com.banklocker.Bank.Locker;

public class Bank {
	protected String location;
	protected String name;
	
	public Bank(String name,String location) {
		this.name = name;
		this.location = location;
	}
	
	public void print() {
		System.out.println("details \nName : "+this.name+"\nLocation : "+this.location);
	}
	
	//Accessing Data From Locker
	public void getBalanceDetails() {
		Locker loc = new Locker(13144, 10000.0f, "pune");
		System.out.println(this.name+" Your Account Balance Is : "+loc.getAccBalance());
	}
	
	class Locker{
		private int accNo;
		private float accBalance;
		private String accType;
		
		public Locker(int accNo,float accBalance,String accType) {
			this.accNo = accNo;
			this.accBalance = accBalance;
			this.accType = accType;
		}
		
		public int getAccNumber() {
			return accNo;
		}
		public float getAccBalance() {
			return accBalance;
		}
		public String getAccType() {
			return accType;
		}
		
		public void print() {
			System.out.println("Details \nAccount Number : "+this.accNo+"\nAccount Balance : "+this.accBalance+"\nAccount Type : "+this.accType);
		}
	}
}
class BankMachine{
	public static void main(String args[]) {
		Bank b = new Bank("Sujal", "Pune");
		b.getBalanceDetails();
	}
}

