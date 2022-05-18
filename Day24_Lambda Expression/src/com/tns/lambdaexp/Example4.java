package com.tns.lambdaexp;

import java.util.LinkedList;

public class Example4 {

	public static void main(String[] args) {
		LinkedList<Integer>obj=new LinkedList<>();
		obj.add(55);
		obj.add(5);
		obj.add(145);
		System.out.println(obj);
		obj.forEach((n)->
		{
			System.out.println(n);
		});
	}

}
