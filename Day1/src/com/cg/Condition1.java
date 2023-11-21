package com.cg;

import java.util.Scanner;

public class Condition1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		if((num%2==0)&&(num>10 && num<25)) {
			System.out.println("TOM");
		}
		else if((num%2!=0) && (num>10 && num<25)) {
			System.out.println("JERRY");
		}
		else {
			System.out.println("TOM & JERRY");
		}
	}

}
