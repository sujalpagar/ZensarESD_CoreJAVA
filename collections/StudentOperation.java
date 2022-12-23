package com.collections;


import java.util.Comparator;

public class StudentOperation implements Comparable<StudentOperation> {
	private int stdRollNo;
	private String stdName;
	private int stdAge;
	
	
	
	public StudentOperation(int stdRollNo, String stdName, int stdAge) {
		super();
		this.stdRollNo = stdRollNo;
		this.stdName = stdName;
		this.stdAge = stdAge;
	}
	
	
	public int getStdRollNo() {
		return stdRollNo;
	}
	public void setStdRollNo(int stdRollNo) {
		this.stdRollNo = stdRollNo;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getStdAge() {
		return stdAge;
	}
	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}
	
	public String toString() {
		return "StudentOperation [stdRollNo=" + stdRollNo + ", stdName=" + stdName + ", stdAge=" + stdAge+ "]";
	}


	@Override
	public int compareTo(StudentOperation o) {
		if(this.getStdAge()> o.getStdAge()) {
			return 1;
		}else if(this.getStdAge() < o.getStdAge()) {
			return -1;
		}else {
			return 0;
		}
	}

}
