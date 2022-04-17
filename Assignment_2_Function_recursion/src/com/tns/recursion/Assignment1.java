//Write a program to find the sum of digits in a number using recursion.
package com.tns.recursion;

import java.util.Scanner;

public class Assignment1 
{
	static int sod(int num)
	{
		if (num==0)
		{
			return 0;
		}
		else
			return num%10+sod(num/10);
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(sod(n)); //fun call
		s.close();


	}

}
