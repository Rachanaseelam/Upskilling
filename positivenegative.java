package com.cg;

public class positivenegative {
	public static void main(String[] args) {
	int arr[]= {0, 8, -4, -66, 9, -41, 10};
	int temp=0;
	for(int i=0; i<arr.length; i++) {
		if(temp>arr[i]) {
			System.out.println("Positive Numbers:" +arr[i]);
		}
		else
		{
			System.out.println("Negative Numbers:"+arr[i]);
		}
	}

}
}
