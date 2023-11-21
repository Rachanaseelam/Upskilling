package com.cg;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Student Details");
		String name=s.nextLine();
		String grade=s.nextLine();
		int id=s.nextInt();
		float per=s.nextFloat();
		
		System.out.println(name+ " " +id+ " "  +grade+ " "+per);
	}

}
