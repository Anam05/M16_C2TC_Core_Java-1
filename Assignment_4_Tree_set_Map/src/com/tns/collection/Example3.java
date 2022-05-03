package com.tns.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example3 {

	public static void main(String[] args) {
		HashSet a=new HashSet();
		a.add(11);
		a.add(null);
		a.add(12);
		System.out.println(a);
		
		LinkedHashSet s=new LinkedHashSet();
		s.add(11);
		s.add(null);
		s.add(12);
		System.out.println(s);

	}

}
