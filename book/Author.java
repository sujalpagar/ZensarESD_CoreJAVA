package com.book;

public class Author {
	protected String aName;
	protected int aId;
	
	//constructor
	public Author(String aName,int aId) {
		this.aName = aName;
		this.aId = aId;
	}
	
	//Setter
	public void setAName(String aName) {
		this.aName = aName;
	}
	
	public void setAId(int aId) {
		this.aId = aId;
	}
	
	//Getter
	public String getAName() {
		return aName;
	}
	public int getName() {
		return aId;
	}
}
