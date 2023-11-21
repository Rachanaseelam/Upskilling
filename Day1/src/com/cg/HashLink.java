package com.cg;

import java.util.LinkedHashSet;

public class HashLink {

	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("Rachana");
		set.add("Anu");
		set.add("JayaSri");
		set.add("Rachana");
		System.out.println(set);
		for(String i: set) {
			System.out.println(i);
		}
		System.out.println(set.remove("Rachana"));
	}
	
	

}