package in.cg.strings;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		//StringBuffer s=new StringBuffer("Hritik");
		
		StringBuffer sb=new StringBuffer(s.nextLine());
		System.out.println(sb.capacity()); // by default capacity is 16
		System.out.println(sb.length()); //by default is 0
		System.out.println(sb);
	}

}
