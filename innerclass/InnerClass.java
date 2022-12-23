package com.innerclass;

import java.util.jar.Attributes.Name;

public class InnerClass {
	private static Model Model;
	private static String name;
	
	public InnerClass(String name) {
		this.name = name;
	}
	public void print() {
		System.out.println("Brand Name Is : "+name);
	}
	
	//Inner Class
	class Model{
		private String modelName;

		public Model(String modelName) {
			this.modelName = modelName;
		}
		
		public void print() {
			System.out.print(name+" "+modelName);
		}
	}
	
	
	//Static Inner Class
	static class StaticInnerClass{
		private String modelName;
		
		public StaticInnerClass(String modelName) {
			this.modelName = modelName;
		}
		
		public void print() {
			System.out.println(name +" "+ modelName);
		}
	}
	
	//Method Local Inner Class
	public void data() {
		String modelName="16";
		class LocalInner{			
			public void print() {
				System.out.println(name+" "+modelName);
			}
		}
		LocalInner li = new LocalInner();
		li.print();
	}
	
	public static void main(String args[]) {
		InnerClass ic = new InnerClass("Iphone");
		
		Model md = ic.new Model("13");
//		md.print();
		StaticInnerClass sic = new StaticInnerClass("13");
//		sic.print();
		
		
	}
}
