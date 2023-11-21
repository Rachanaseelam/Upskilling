package com.cg;

import java.util.HashSet;



public class Hash {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("Rachan");
		set.add("Anu");
		set.add("JayaSri");
		set.add("Rachana");
		System.out.println(set);
		for(String i: set) {
			System.out.println(i);
		}
		
	}


}
