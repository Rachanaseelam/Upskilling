package com.cg;

import java.util.HashMap;

public class HashMapping {

	public static void main(String[] args) {
		HashMap<Integer, String> hs=new HashMap<Integer, String>();
		hs.put(2, "Rachana");
		hs.put(3, "Sai");
		hs.put(4, "vamsi");
		hs.put(5, "Seelam");
		System.out.println(hs);
		System.out.println(hs.get(5));
		System.out.println(hs.remove(2));
		for(String i:hs.values()){
			System.out.println(i);
		}
		for(int i:hs.keySet()) {
			System.out.println(i);
		}

	}

}