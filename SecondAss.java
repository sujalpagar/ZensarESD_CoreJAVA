package com;

public class SecondAss {
//Abstraction
	private int Rollno = rollStart;
	private String Name;
	private static int rollStart = 1;
	private float sub1; //Encapsulation
	private float sub2;
	private float sub3;
	private static int counter = 0;
	public static String colName ="DY Patil College Of Engineering.";
	
// Constructor
	SecondAss(String Name, float sub1, float sub2, float sub3){
		this.Rollno = rollStart;
		rollStart++;
		this.Name = Name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		
		counter++;
	}
	
// Setter Method
//	public void setRollNo(int Rollno) {
//		this.Rollno = Rollno;
//	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public void setsub1(int sub1) {
		this.sub1 = sub1;
	}
	
	public void setsub2(int sub2) {
		this.sub2 = sub2;
	}
	
	public void setsub3(int sub3) {
		this.sub3 = sub3;
	}
	
// getter method
	public int getRollno() {
		return this.Rollno;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public float getSub1() {
		return this.sub1;
	}
	
	public float getSub2() {
		return this.sub2;
	}
	
	public float getSub3() {
		return this.sub3;
	}
	
// toString Method
	public String toString() {
		return ("Student Details....\n"+"College Name : "+this.colName+"Student Name : "+this.Name+"\n"+"Roll Number : "+this.Rollno);
	}	
	
// Business logic Method	
	public float avgMarks() {
		float avg = ((sub1+sub2+sub3)*100f)/300f;
		return avg;
	}
	
	public String grade() {
		if(this.avgMarks()>=50 && this.avgMarks()<65) {
			return "B";
		}else if(this.avgMarks()>65 && this.avgMarks()<75) {
			return "A";
		}else if(this.avgMarks()>=75) {
			return "A+";
		}else {
			return "Fail";
		}
	}
	
	//total student in class
	public int stdCounter() {
		return rollStart;
	}
	
// Facilitetor Method	
	public void details() {
		System.out.println("Student Details....\n"+"College Name : "+this.colName+"Student Name : "+this.Name+"\n"+"Roll Number : "+this.Rollno+"\nStudent Name : "+Name+"\n"+"Average : "+avgMarks()+"\n"+"Grade : "+grade());
	}
	
	
	//Not Complete
//	public static  createClass() {
//		if(SecondAss.counter<=1) {
//			obj= new SecondAss;
//		}else {
//			System.out.println("You Can't Made New Object.");
//		}
//	}
	
// Entrypoint Method	
	public static void main(String args[]) {
		
		SecondAss std1 = new SecondAss("sujal pagar",79.0f,96.0f,76.0f);
//		
		if(SecondAss.counter<=1) {
			SecondAss std2 = new SecondAss("xyz",89.0f,56.0f,36.0f);
		}else {
			System.out.println("You Can't Made New Object.");
		}
		
		System.out.println("Total No. of Objects Made : "+ SecondAss.counter);
		
	}
}
