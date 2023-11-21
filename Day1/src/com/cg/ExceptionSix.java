package com.cg;

public class ExceptionSix {

	public static void main(String[] args) {
		try {
		int arr[]= {3, 5, 7, 9, 0};
		System.out.println(arr[7]);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of the code occurs");
	}

}