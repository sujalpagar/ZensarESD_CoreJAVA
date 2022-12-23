package com;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAss {
	
//Abstraction
	private int accNo; //Encapsulation (private data)
	private String accType;
	private float accBalance;
	private AccountDate OpDate;
	private static int accNoStart=1000;

// Constructor
	public FirstAss(String accType,float accBalance, AccountDate OpDate) {
		this.accNo=accNoStart;
		accNoStart++;
		this.accType= accType;
		this.accBalance=accBalance;
		this.OpDate = OpDate;
	}
	
// Setter Method
//	public void setAccNo(int accNo) {
//		this.accNo = accNo;
//	}
	
	public void setAccType(String accType) {
		this.accType = accType;
	}
	
	public void setAccBal(float accBalance) {
		this.accBalance = accBalance;
	}
	
// Getter Method
	public int getAccNo() {
		return  this.accNo;
	}
	
	public String getAccType() {
		return this.accType;
	}
	
	public float getAccBal() {
		return this.accBalance;
	}
	
// toString Method
	public String toString() {
		return ("Account Details....\n"+"Account Number : "+this.accNo+"\nAccount Type : "+this.accType+"\nAccount Balance : "+this.accBalance);
	}
	
	
// Business logic Method
	public float deposit(int number, float amount) {
		if(this.accNo == number) {
			this.accBalance += amount;
			System.out.println("Successful.... "+amount+"Balance Credited Final Balance"+accBalance);
		}else {
			System.out.println("Invalid Account Number...Please Try Again////");
		}
		return accBalance;
	}
	
	public float withdraw(int number, float amount) {
		if(this.accBalance>5000 && number==this.accNo) {
			this.accBalance -= amount;
			System.out.println(amount+" Balance is Debited Total Balance is "+this.accBalance);
		}else {
			System.out.println("Failed....You can't Withdraw Money");
		}
		return this.accBalance;
	}
	
	public void enquire(long accNo2) {
		if(this.accNo == accNo2 ) {
			System.out.println("your Account Balance is "+ accBalance);
		}
	}
	
	public void bonus() {
		int year = 2022-OpDate.getYy();
		
		if(year >= 10) {
			this.accBalance += 10000;  
			System.out.println("10Year+ Bonus Money Credited Your Account Total Salary Is "+this.accBalance);
		}else {
			System.out.println("Bonus is Not Credited...");
		}
	}
	
// Facilitetor Method
	public void display() {
		System.out.println("\nAccount Details Are......\n"+"Account Number : "+accNo+"\n"+"Account Type : "+accType+"\n"+"Account Balance : "+accBalance);
	}
	
// Entrypoint Method	
	public static void main(String args[]) {
		
		FirstAss arr[] = new FirstAss[10];
		
		arr[0]= new FirstAss("Saving",40000,new AccountDate(10,5,2011));
	    arr[1] = new FirstAss("Current",20000,new AccountDate(22,2,2019));
	    arr[1] = new FirstAss("Saving", 80000, new AccountDate(5, 12, 2012));
	    arr[2] = new FirstAss("Saving", 100000, new AccountDate(18, 12, 2008));
	    arr[3] = new FirstAss("Saving", 50000, new AccountDate(19, 5, 2009));
	    arr[4] = new FirstAss("Saving", 75000, new AccountDate(17, 12, 2019));
	    arr[5] = new FirstAss("Saving", 98000, new AccountDate(26, 4, 2019));
	    arr[6] = new FirstAss("Saving", 56000, new AccountDate(22, 7, 2015));
	    arr[7] = new FirstAss("Saving", 81000, new AccountDate(29, 3, 2019));
	    arr[8] = new FirstAss("Saving", 44000, new AccountDate(1, 6, 2017));
		arr[9] = new FirstAss("Saving", 30000, new AccountDate(4, 2, 2022));
		
		
		//Search Account number
		System.out.println("Enter Your Account Number");
		Scanner sc = new Scanner(System.in);
		int findAccNo = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			if(findAccNo == arr[i].accNo) {
				System.out.println(arr[i]);
			}
		}
		
		//Deposit money
		System.out.println("Enter Your Account Number");
		int fromAccNo = sc.nextInt();
		System.out.println("Enter To Send Account Number");
		int toAccNo = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i].getAccNo()==fromAccNo && arr[j].getAccNo()==toAccNo) {
					arr[i].setAccBal(arr[i].getAccBal()-1000);
					arr[j].setAccBal(arr[j].getAccBal()+1000);
				}
			}
		}
		
		//Sort Account Number 
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].getAccBal() > arr[j + 1].getAccBal()) {
                	int accno1 = (int) arr[j].getAccNo();
                	int accno2 = arr[j + 1].getAccNo();
                    int temp = (int) arr[j].getAccNo();
                    accno1= (int) arr[j + 1].getAccNo();
                    accno2 = temp;
                }
            }
        }
		
//		
	}
}


