package com.cg;

import java.util.Scanner;

public class ExceptionTwo {

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
		//catch block is not occured when the b value isn't given as zero
		{
			System.out.println("Don't enter zero");
		}
		finally {
			System.out.println("Exceuted Compulsory");
			
		}

	}

}
