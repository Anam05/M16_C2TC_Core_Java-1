package com.tns.operator;

public class BitwiseOperator {

	public static void main(String[] args) 
	{
		int a=5, b=2;
		int res=a & b; //bitwise and
		int res1 = a | b; //Bitwise OR
		int res2= a ^ b; //Bitwise XOR
		int res3= a<<b; //Bitwise leftshift
		int res4= a>>b; //Bitwise rightshift
		
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
	}

}
