package com.indiabix.generics;

public class GenericClass<T> {
	
	T val;
	
	void print() 
	{
		System.out.println(val.getClass());
	}

	public static void main(String[] args) {
		GenericClass<String> obj = new GenericClass<>();
		GenericClass<Integer> obj1 = new GenericClass<>();
		GenericClass<Double> obj2 = new GenericClass<>();
		obj.val="12";
		obj1.val=15;
		obj2.val=15.55;
		obj.print();
		obj1.print();
		obj2.print();
	}

}
