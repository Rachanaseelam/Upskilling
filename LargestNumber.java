package com.cg;

import java.util.Arrays;

public class LargestNumber {
	public static void main(String[] args) {
		int arr[]=new int[] {54, 8, 84, 12};
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
				System.out.println(max);
			}
			
		}

	
	}

}
