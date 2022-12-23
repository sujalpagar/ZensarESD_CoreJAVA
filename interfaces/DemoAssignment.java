package com.interfaces;

public interface DemoAssignment {
	public abstract void getDetails();
}

class FinalData {
	
	public static void main(String args[]) {
		DemoAssignment da = new DemoAssignment() {
		int balance = 10000;
		String type = "Saving";

			
			public void getDetails() {
				System.out.println("Your Account Type Is  "+type+" And Account Balance Is "+balance);				
			}
		};
		
		da.getDetails();
	}
}