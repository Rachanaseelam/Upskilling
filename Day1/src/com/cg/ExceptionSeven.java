package com.cg;

public class ExceptionSeven {

	public static void main(String[] args) {
		try {
		String s="rachana";
		System.out.println(s.charAt(10));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}

	}

}
