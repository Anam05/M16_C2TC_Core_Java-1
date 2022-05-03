package com.indiabix.collections;

import java.util.ArrayList;
import java.util.Vector;

public class Example7 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(11);
		a.add("Hritik");
		Vector v=new Vector();
		a.addAll(a);
		System.out.println(a);

	}

}
