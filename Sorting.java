package com.cg;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Sai");
		list.add("Vamsi");
		list.add("Rachana");
		list.add("Seelam");
		Collections.sort(list);
		System.out.println(list);
	}

}