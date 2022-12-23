package com.ExceptionHandling;

public class FindOddPrime {
	public static void checkOdd(int number) throws OddNumberException {
		if(number % 2 == 0) {
			System.out.println(number+" Number Is Not Odd");
		}else {
			throw new OddNumberException(number+" Number Is Odd .");
		}
	}
	
	
	public static void checkPrime(int number) throws PrimeNumberException{
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				throw new PrimeNumberException(number+" Is Prime Number.");
			}
		}
		System.out.println(number +" Is Not Prime Number.");
	}
	
	public static void main(String args[]) {
		int number = Integer.parseInt(args[0]);
		try {
			checkOdd(number);
			checkPrime(number);
		}
		catch(PrimeNumberException e) {
			e.printStackTrace();
		}
		catch(OddNumberException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
