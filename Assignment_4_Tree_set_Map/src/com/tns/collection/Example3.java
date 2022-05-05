package com.tns.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Example3 {

	public static void main(String[] args) {
		HashSet<Integer> a=new HashSet<Integer>();
		a.add(11);
		a.add(null);
		a.add(12);
		System.out.println(a);
		
		LinkedHashSet<Integer> s=new LinkedHashSet<Integer>();
		s.add(11);
		s.add(null);
		s.add(12);
		System.out.println(s);

	}

}
