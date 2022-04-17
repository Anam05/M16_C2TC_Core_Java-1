/*Write a program to find the nth term in the Fibonacci series using recursion.
Note that the first 2 terms in the Fibonacci Series are 0 and 1.*/
package com.tns.recursion;

import java.util.Scanner;

public class Assignment2 
{	
	public static int fib(int n)
	{
		if(n==0)
			{
				return 0;
			}	
		else if(n==1)
		{
			return 1;
		}
		else 
			{
				return fib(n-1)+fib(n-2);
			}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter limit");
		int n=s.nextInt();
		System.out.println(fib(n));
		s.close();

	}

}
