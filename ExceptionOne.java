package com.cg;

import java.util.Scanner;

public class ExceptionOne {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
		System.out.println("Enter the values");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Don't enter 0");
		}
		System.out.println("More code can go here");
	}

}