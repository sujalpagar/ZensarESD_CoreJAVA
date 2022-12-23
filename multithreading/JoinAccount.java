package com.multithreading;

public class JoinAccount {
	private float accBal;
	
	public JoinAccount(float accBal){
		this.accBal = accBal;
	}
	
	public synchronized void withdraw(float amount) {
		accBal -= amount;
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		print();	
	}
	
	public void print() {
		System.out.println("balance updated..."+accBal);
	}
}
class UserThread extends Thread{
	JoinAccount acc;
	float amount;
	
	public UserThread(JoinAccount acc, float amount) {
		this.acc = acc;
		this.amount = amount;
		
		Thread t1 = new Thread(this);
		t1.start();
	}
		
	public void run() {
		acc.withdraw(amount);
	}
}
class Transaction{
	public static void main(String args[]) {
		JoinAccount acc = new JoinAccount(10000.f);
		UserThread father = new UserThread(acc, 1000.0f);
		UserThread dauther = new UserThread(acc,500.0f);
	}
}

