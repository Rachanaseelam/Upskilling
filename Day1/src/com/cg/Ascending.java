package com.cg;

import java.util.Arrays;
import java.util.Scanner;

public class Ascending {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();
		char charArray[]=str.toCharArray();
		Arrays.sort(charArray);
		System.out.println(charArray);
		

	}

	

}