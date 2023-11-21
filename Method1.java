package com.cg;

public class Method1 {
	public static void areaR(int l, int b) {
		int rect=l*b;
		System.out.println("Rectangle" +rect);
	}
	public static void areaT(int h, int b) {
		float tri=0.5f*b*h;
		System.out.println("triangle" +tri);
	}

	public static void main(String[] args) {
		areaR(34, 5);
		areaT(23, 4);
	}

}
