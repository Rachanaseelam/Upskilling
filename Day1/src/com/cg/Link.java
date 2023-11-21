package com.cg;

import java.util.LinkedList;

public class Link {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Apple");
		ll.add("Mango");
		ll.add("banana");
		System.out.println(ll);
		ll.addFirst("Guava");
		ll.addLast("Dragon");
		System.out.println(ll);
		ll.addLast("kiwi");
		System.out.println(ll);
		ll.removeFirst();
		for(String i:ll) {
			System.out.println((i));
		}
		System.out.println(ll.getFirst());
		
	}
}