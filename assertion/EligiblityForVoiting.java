package com.assertion;

public class EligiblityForVoiting {
	static int age;
	public static int calAge(int birthyear) {
		int currentyear = 2022;
		age = currentyear - birthyear;
		return age;
	}
	
	public static void EligiblityForVoiting(int age) {
		if(age>=18) {
			System.out.println("You Are Eligible For Voting.");
		}else {
			System.out.println("You Are Not Eligible");
		}
	}
	
	public static void main(String args[]) {
		int birthyear = Integer.parseInt(args[0]);
		EligiblityForVoiting(birthyear);
		
		assert(calAge(birthyear)>0):"Age Is In Negative";
	}
}
