package com.indiabix.collections;

import java.util.LinkedList;

public class Example4 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList<>();
		System.out.println(l.isEmpty());
		l.add(1);
		l.add("Hritik");
		l.add('C');
		l.add(12.5);
		l.add(1);
		l.addFirst(2);
		l.addLast(17);
		
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.contains(15));
		System.out.println(l.indexOf(1));
		System.out.println(l.lastIndexOf(1));
		System.out.println(l.get(2));
		l.set(4, 23);
		System.out.println(l);
		System.out.println(l.isEmpty());

	}

}
