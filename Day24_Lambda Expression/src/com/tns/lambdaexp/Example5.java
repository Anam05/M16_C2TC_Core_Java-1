package com.tns.lambdaexp;

interface D
{
	int mul(int a, int b);
}


public class Example5 {

	public static void main(String[] args) {
		
		//Lambda Expression Without return statement
		D obj = (int a, int b)-> (a*b);
		System.out.println("The multiplication of a and b is "+ obj.mul(30, 10));

	}

}
