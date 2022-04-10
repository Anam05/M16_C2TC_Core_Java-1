package com.tns.operator;

public class UnaryOperator {

	public static void main(String[] args) 
	{
		int a=5,b=3;
		int x=a++; //5 Preincrement ++a
		int y=++b; //4 postincrement a++
		int z=a+x; //6+5=11
		//Preincrement --a
		//postincrement a--
		
		System.out.println(z);
	}

}
