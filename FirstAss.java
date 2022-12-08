package com;

public class FirstAss {
	private int accNo;
	private String accType;
	private float accBalance;

	public void setDetails(int number, String type, float bal) {
		accNo = number;
		accType = type;
		accBalance = bal;
	}
	
	public float deposit(int number, float amount) {
		if(number == accNo) {
			accBalance += amount;
			System.out.println("Successful.... "+amount+"Balance Credited Final Balance"+accBalance);
		}else {
			System.out.println("Invalid Account Number...Please Try Again////");
		}
		return accBalance;
	}
	
	public void display() {
		System.out.println("\nAccount Details Are......"+"Account Number : "+accNo+"\n"+"Account Type : "+accType+"\n"+"Account Balance : "+accBalance);
	}
	
	public float withdraw(int number, float amount) {
		if(accBalance>5000) {
			accBalance -= amount;
			System.out.println(amount+" Balance is Debited Total Balance is "+accBalance);
		}else {
			System.out.println("Failed....You can't Withdraw Money");
		}
		return accBalance;
	}
	
	public void Enquire(int number) {
		if(accNo == number ) {
			System.out.println("your Account Balance is "+ accBalance);
		}
	}
	
	
	public static void main(String args[]) {
		FirstAss acc = new FirstAss();
		acc.setDetails(13144,"Current",10000f);
//		acc.deposit(13144, 12000.0f);
//		acc.withdraw(13144, 3000);
//		acc.Enquire(13144);
		acc.display();
	}
}


