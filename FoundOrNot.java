package com.cg;

import java.util.ArrayList;

public class FoundOrNot {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Rachana");
		ar.add("Seelam");
		ar.add("Sai");
		ar.add("Vamsi");
		if(ar.contains("Seelam")) {
			System.out.println("It was found");
		}
		else {
			System.out.println("Not found");
		}

	}

}