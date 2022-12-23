package com.generics;

public class DemoGenerics<T,U extends Number> {
	T object;
	U object2;
	
	public DemoGenerics(T object,U object2) {
		this.object = object;
		this.object2 = object2;
	}
	
	public U getData(){
		return object2;
	}
	
	public T getData1() {
		return object;
	}
	
	public static void main(String args[]) {
		DemoGenerics<Integer,Float> dg= new DemoGenerics<>(13144,13144.0f);  //Diamod Operation
		Float val = dg.getData();
		int val2 = dg.getData1();
		
		System.out.println(val);
		System.out.println(val2);
	}
}
