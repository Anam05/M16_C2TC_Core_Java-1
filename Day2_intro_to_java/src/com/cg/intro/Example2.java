package com.cg.intro;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		double b=s.nextDouble();
		float c=s.nextFloat();
		String str = s.next();
		char ch = str.charAt(0); 
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(str);
		System.out.print(ch);
		
		s.close();

	}

}
