package com.cg;

public class ExceptionFour {
	public static void vote(int age) {
		if(age<=18) {
			throw new ArithmeticException("Not Eligible to vote");
		}
		else {
			System.out.println("Eligible to vote");
		}
	}

	public static void main(String[] args) {
		
		vote(29);
		
	}

}
