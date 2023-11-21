package com.cg;

public class Buffer {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Rachana");
		s.append("Seelam");
		System.out.println(s);
		s.insert(6, "a");
		System.out.println(s);
		s.replace(0, 8, "sai");
		System.out.println(s);
		s.delete(0,3);
		System.out.println(s);
		System.out.println(s.reverse());
		System.out.println(s.capacity());
	}

}