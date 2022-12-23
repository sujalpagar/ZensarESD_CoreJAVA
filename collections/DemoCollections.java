package com.collections;

import java.util.*;

public class DemoCollections {
	
	public static void main(String args[]) {
		ArrayList arr = new ArrayList<>();
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(500);
		arr.remove(2);
		arr.get(2);
		System.out.println(arr);
		
		Vector v = new Vector<>(4,20);
		v.add(100);
		v.add(200);
		v.add(800);
		v.remove(1);
		System.out.println(v.capacity());
		System.out.println(v);
		
		HashSet hs = new HashSet<>(); //give random order output
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(90);
		hs.remove(20);
		System.out.println(hs);
		
		TreeSet ts = new TreeSet<>();
		ts.add(18);
		ts.add(68);
		ts.add(20);
		ts.add(44);
		ts.remove(68);
		System.out.println(ts);
		
		HashMap hm = new HashMap<>();
		hm.put(13144,"sujal");
		hm.put(13112, "pranav");
		hm.put(13140, "prince");
		hm.put(13108, "rohit");
		hm.remove(13140);
		System.out.println(hm);
	}
}
