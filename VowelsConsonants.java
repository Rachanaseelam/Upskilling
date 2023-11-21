package com.cg;

public class VowelsConsonants {
	public static void main(String[] args) {
		String str="Rachana";
		int vcount=0;
		int ccount=0;
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u' ) {
				System.out.println("Vowels:" +ch);
				vcount++;
			}
			else
			{
				System.out.println("Consonant:" +ch);
			}
		}
	}
}
   


