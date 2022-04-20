package com.indiabix.interface1;
interface Mother 
{
	void display();
	
}
interface Father 
{
	void display1();
}
class Daughter implements Mother,Father	
{
	public void display()
	{
		System.out.println("Mother");
	}
	public void display1()
	{
		System.out.println("Father");
	}
	public static void main(String args[])
	{
		Daughter d=new Daughter();
		d.display();
		d.display1();
	}
	
}