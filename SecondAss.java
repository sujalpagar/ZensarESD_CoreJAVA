package com;

public class SecondAss {
	int Rollno;
	String Name;
	private float sub1;
	private float sub2;
	private float sub3;
	
	public void setData(int Number,String name, float s1, float s2, float s3) {
		Rollno = Number;
		Name = name;
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
	}
	
	public float avgMarks() {
		float avg = ((sub1+sub2+sub3)*100f)/300f;
		return avg;
	}
	
	public String grade() {
		if(avgMarks()>=50 && avgMarks()<65) {
			return "B";
		}else if(avgMarks()>65 && avgMarks()<75) {
			return "A";
		}else if(avgMarks()>=75) {
			return "A+";
		}else {
			return "Fail";
		}
	}
	
	public void details() {
		System.out.println("Student Details....\n"+"Student Name : "+Name+"\n"+"Roll Number : "+Rollno+"\n"+"Average : "+avgMarks()+"\n"+"Grade : "+grade());
	}
	
	public static void main(String args[]) {
		SecondAss std1 = new SecondAss();
		std1.setData(13144,"Sujal Pagar",79f,96f,26f);
//		System.out.println(std1.avgMarks());
//		System.out.println(std1.grade());
		std1.details();
	}
}
