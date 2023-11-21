package com.cg;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sorted {

	public static void main(String[] args) {
		SortedSet<Integer> ss=new TreeSet<Integer>();
		ss.add(7);
		ss.add(2);
		ss.add(6);
		ss.add(4);
		ss.add(1);
		System.out.println(ss);
		for(Integer i:ss) {
			System.out.println(i);
		}
		SortedSet<String> ss1=new TreeSet<String>();
		ss1.add("Rachana");
		ss1.add("Seelam");
		ss1.add("Sai");
		ss1.add("Vamsi");
		System.out.println(ss1);
	}

}