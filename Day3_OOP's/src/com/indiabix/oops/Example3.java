//create any class, use constructor parameterized constructor
package com.indiabix.oops;

public class Example3 
{
	String Breed;
	Example3(String Dog_breed)
	{
		Breed= Dog_breed;
	}
	void display()
	{
		System.out.println("Dog is of " + Breed + " Breed" );
	}
	public static void main(String[] args) 
	{
		Example3 a1=new Example3("Pomerenian");
		Example3 a2=new Example3("German Shephard");
		Example3 a3=new Example3("Labrador");
		a1.display();
		a2.display();
		a3.display();
	}

}
