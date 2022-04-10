package com.tns.decisionmaking;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		
		switch(a)
		{
			case "jungle":
				System.out.println("Erangel");
				break;
			case "snow":
				System.out.println("Vikendi");
				break;
			case "desert":
				System.out.println("Miramar");
				break;
			default:
				System.out.println("Invalid input");
		}
		s.close();
	}

}
