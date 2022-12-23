package com.ExceptionHandling;

public class CheckConVowel {
	
	public static void checkVowel(String ch) throws VowelException,ConsonentException {
		if(ch.equals("a") || ch.equals("e") ||ch.equals("i") ||ch.equals("o") ||ch.equals("u")) {
			throw new VowelException(ch +" Is Vowel");
		}
		else {
			throw new ConsonentException(ch + " Is Consonent.");
		}
	}

	public static void main(String args[]) {
		try {
			String ch = args[0];
			checkVowel(ch);
		}catch(VowelException e){
			e.printStackTrace();
		}catch(ConsonentException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
