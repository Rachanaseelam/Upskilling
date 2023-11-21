package com.cg;

public class Method {

	public static void areaR() {
		int l=23;
		int b=56;
		int rect=l*b;
		System.out.println("Area of rectangle: " +rect);
	}
	public static void areaT() {
		int h=23;
		int b=56;
		float tri=0.5f*b*h;
		System.out.println("Area of triangle: " +tri);
	}
	public static void areaS() {
		int s=23;
		int square=s*s;
		System.out.println("Area of square: " +square);
	}
	public static void main(String[] args) {
		areaR();
		areaT();
		areaS();
		areaR();
	}

}
