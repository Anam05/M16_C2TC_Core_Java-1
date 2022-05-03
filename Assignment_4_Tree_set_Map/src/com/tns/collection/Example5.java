package com.tns.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Example5 {

	public static void main(String[] args) {
		NavigableMap<Integer,String>s=new TreeMap<Integer,String>();
		s.put(15 , "Hritik");
		s.put(12, null);
		
		System.out.println(s);
		
		s.remove(12);
		System.out.println(s);
		
		System.out.println(s.lastEntry());
	}

}