package com.indiabix.collections;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		List l=new ArrayList<>();
		System.out.println(l.isEmpty());
		l.add(1);
		l.add("Hritik");
		l.add('C');
		l.add(12.5);
		l.add(1);
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
