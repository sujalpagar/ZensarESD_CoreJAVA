package com.inheritance;

public class Employee {
	protected int eId;
	protected String eName;
	protected float eSalary;
	
	
	public Employee(int eId, String eName, float eSalary) {
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	}
	
	public float printSalary() {
		return this.eSalary*12;
	}
	
	public void printDetails() {
		System.out.println("Details Is : \n"+"Id : "+this.eId+"\nName : "+this.eName+"\nSalary : "+this.eSalary);
	}

}

class Manager extends Employee{
	protected float insc;
	
	public Manager(int eId,String eName, float eSalary,float insc) {
		super(eId,eName,eSalary);
		this.insc=insc;
	}
	
	public float printSalary() {
		float nSalary = super.eSalary;
		return (nSalary+insc*12);
	}
	
	public void printDetails() {
		System.out.println("Details Is : \n"+"Id : "+this.eId+"\nName : "+this.eName+"\nSalary : "+this.eSalary);
		System.out.println("Your Insc Is : "+this.insc);
	}
}

class SalesManager extends Manager{
	protected float foodAll;
	protected float petrolAll;
	protected float mobileAll;
	
	public SalesManager(int eId,String eName, float eSalary,float insc,float foodAll,float petrolAll,float mobileAll) {
		super(eId,eName,eSalary,insc);
		this.foodAll = foodAll;
		this.petrolAll = petrolAll;
		this.mobileAll = mobileAll;
	}
	
	public float printSalary() {
		float salary = super.eSalary+((this.foodAll+this.petrolAll+this.mobileAll)*12);
		return salary;
	}
	
	public void printDetails() {
		System.out.println("Details Is : \n"+"Id : "+this.eId+"\nName : "+this.eName+"\nSalary : "+this.eSalary);
		System.out.println("Your Insc Is : "+this.insc);
		System.out.println("For Food Money Is : "+this.foodAll);
		System.out.println("For Petrol Money Is : "+this.petrolAll);
		System.out.println("For Mobile Money Is : "+this.mobileAll);
		System.out.println("Total CTC Is : "+printSalary());		
	}
}
class MainOffice {
	public static void main(String args[]) {
		Manager m1 = new Manager(13144,"Sujal Pagar",80000,10000);
		SalesManager s1 = new SalesManager(13199,"XYZ",120000,10000,5000,2000,1000);
//		System.out.println(s1.printSalary());
		s1.printDetails();
//		System.out.println(m1.printSalary());
//		m1.printDetails();
		
	}
}