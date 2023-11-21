package com.cg;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		//System.out.println("Enter the number");
		//int n=s.nextInt();
		
		for(int i=1; i<=23; i++) {
			int count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i+ "It is a prime number");
			}
		}

	}

}
