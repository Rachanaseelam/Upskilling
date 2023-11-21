package com.cg;

public class Swap {

	public static void main(String[] args) {
		int a=8; int b=4;
		System.out.println("Before Swaping "+a+ " "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swaping" +a+ " "+b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("After Swaping Using Third Variable " +a+ " "+b);

	}

}
