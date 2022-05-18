package com.tns.lambdaexp;

interface A
{
	void show(); //Functional interface which contains only one abstract method
}

/*class B implements A
{
	public void show()
	{
		System.out.println("Functional Interface");
	}
}*/

public class Example1 {

	public static void main(String[] args) 
	{
		//Lambda Expression with no parameter
		A obj = ()->
		{
			System.out.println("Functional Interface");
		};
		//B obj = new B();
		obj.show();
	}

}
