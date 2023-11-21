package com.cg;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int num=s.nextInt();
		int rem, rev=0, temp=num;
		while(num>0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==temp) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}

	}

}
