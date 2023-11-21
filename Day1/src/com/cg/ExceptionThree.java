package com.cg;

import java.util.Scanner;

public class ExceptionThree {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter the values");
			int a=s.nextInt();
			int b=s.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		finally{
			System.out.println("Final Block");
		}
	}
}