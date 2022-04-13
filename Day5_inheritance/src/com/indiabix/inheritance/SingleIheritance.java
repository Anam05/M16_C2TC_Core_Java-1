package com.indiabix.inheritance;

class Parent
{
	void  print()
	{
		System.out.println("Hello, Whats going on?");
	}
}
class Child extends Parent
{
	void display()
	{
		System.out.println("Child class");
	}
}
public class SingleIheritance {

	public static void main(String[] args) {
		Child  c=new Child();
		c.display();
		c.print();
	}

}
