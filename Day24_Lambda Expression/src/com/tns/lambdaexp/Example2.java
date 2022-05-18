package com.tns.lambdaexp;
interface B
{
	String display(String str);
}

public class Example2 {

	public static void main(String[] args) 
	{	
		//using return stament
		//Lambda Expression with Single Parameter.
		B obj=(String str)->
		{
			return str;
		};
		System.out.println(obj.display("Lambda Expression with single parameter."));

	}

}
