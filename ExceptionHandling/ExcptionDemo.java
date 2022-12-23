package com.ExceptionHandling;

public class ExcptionDemo 
	{
	public static void checkInput(int number) throws InvalidInputException {
		if(number<=0) {
			throw new InvalidInputException("Input Is Zero Or Less Than Zero");
		}else {
			System.out.println("Your Input Is : "+number+" Is Valid.");
		}
	}
	public  static void main(String args[]) {
		try {
			int number = Integer.parseInt(args[0]);
			checkInput(number);
		} 
		catch(InvalidInputException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("Output Complete.");
		}
	}
}
