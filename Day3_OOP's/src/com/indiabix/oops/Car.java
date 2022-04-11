package com.indiabix.oops;

public class Car 
{
	String name="Mercedes"; //variable
	void print() //method
	{
		System.out.println("THis is "+name);
	}

	public static void main(String[] args) 
	{
		Car obj1 = new Car();
		obj1.print();
	}

}
