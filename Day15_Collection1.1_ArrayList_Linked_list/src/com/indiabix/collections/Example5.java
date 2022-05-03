package com.indiabix.collections;

import java.util.Vector;

public class Example5 {

	public static void main(String[] args) {
		Vector v= new Vector();
		v.add(0, "Hritik");
		v.add(1, 11);
		v.add(2, 26.75);
		System.out.println(v);
		v.setElementAt(47, 0);
		
		System.out.println(v);

	}

}
