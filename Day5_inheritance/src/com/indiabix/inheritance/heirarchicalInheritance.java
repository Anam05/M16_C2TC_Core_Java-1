package com.indiabix.inheritance;

class Vehicle
{
	void print()
	{
		System.out.println("Vehicle Types : ");
	}
}

class Car extends Vehicle
{
	void display()
	{
		System.out.println("Car :: Mercedes-Benz");
	}

}

class Bike extends Vehicle
{
	void display1()
	{
		System.out.println("Bike :: R-15");
	}

}
public class heirarchicalInheritance {

	public static void main(String[] args) 
	{
		Bike b=new Bike();
		Car c=new Car();
		b.print();
		b.display1();
		c.display();
		
	}

}
