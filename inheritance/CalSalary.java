package com.inheritance;
import java.util.*;


public class CalSalary {
	
	public void empSalary(Employee e) {
		System.out.println("Total Salary Is : "+e.eSalary);
	}
	
//	public void manSalary(Manager e) {
//		System.out.println("Total Salary Is : "+e.eSalary);
//	}
	
	public static void main(String[] args) {
		Employee e = null;
		CalSalary s = new CalSalary();
//		String destination = "Employee";
//		String destination = "Manager";
		String destination = "ClientServiceManager";
		if(destination.equals("Employee")) {
			e = new Employee(13144,"sujal",100000);
			s.empSalary(e);
		}if(destination.equals("Manager")) {
			e = new Manager(12144,"Rutuja",120000,10000);
			s.empSalary(e);
		}if(destination.equals("ClientServiceManager")) {
			System.out.println("Profile Is Under Construction.");
		}

	}

}
