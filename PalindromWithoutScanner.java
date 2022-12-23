package com;

public class PalindromWithoutScanner {
	public static String palindrom(int i) {
		int inputNumber = i;
		int ans = 0;
		
		while(inputNumber != 0) {
			
			int val = inputNumber % 10;   
			ans = (ans * 10)+val;         
			inputNumber /= 10;            
						
		}
		
		if(ans == i) {
			return (i+" is Palindrome Number.");
		}else {
			return (i+" is Not Palindrome Number.");
		}
		
	}
	
	public static void main(String args[]) {
		
		Integer i = Integer.valueOf(args[0]);  //taking variable Input
		Integer data = new Integer(i);         //Boxing
		int val = data.intValue();             //UnBoxing
		
		System.out.println(palindrom(val));    //function call 
		
	}

}
