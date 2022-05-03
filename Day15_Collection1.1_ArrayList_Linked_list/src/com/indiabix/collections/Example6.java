package com.indiabix.collections;

import java.util.Stack;

public class Example6 {

	public static void main(String[] args) {
		Stack s= new Stack();
		s.add(10);
		s.add(20);
		s.add(30);
		System.out.println(s);
		s.pop();
		System.out.println(s);		
		s.push(40);
		System.out.println(s);
	}

}
