package com.cg;

import java.util.ArrayList;

public class Names {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Rachana");
		list.add("Seelam");
		list.add("Vamsi");
		list.add("Sai");
		System.out.println(list);
		//accessing an item
		System.out.println(list.get(0));
		//changing the data
		System.out.println(list.set(3, "Vamsi"));
		System.out.println(list);
		//delete the data
		System.out.println(list.remove(1));
		System.out.println(list);
		System.out.println(list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(String i:list) {
			System.out.println(i);
		}

	}

}