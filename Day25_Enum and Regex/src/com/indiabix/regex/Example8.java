package com.indiabix.regex;

import java.util.Scanner;

public class Example8 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Scanner s=new Scanner(System.in);
		String str="M-16 @@ Pratik Jain @@ Ankita @@ Hritik";
		String[] res=str.split("@@");
		for(String i:res)
		{
			System.out.println(i);
		}

	}

}

