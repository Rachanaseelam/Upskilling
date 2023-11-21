package com.cg;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int num=s.nextInt();
		int arm=0, rem, temp=num;
		while(num>0) {
			rem=num%10;
			arm=arm+rem*rem*rem;
			num=num/10;
		}
		if(arm==temp) {
			System.out.println(arm+ "is an armstrong number");
		}
		else {
			System.out.println(arm+ "is not an armstrong number");
		}

	}

}
