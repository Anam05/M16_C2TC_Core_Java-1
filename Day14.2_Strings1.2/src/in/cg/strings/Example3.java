package in.cg.strings;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		StringBuilder sb=new StringBuilder(s.nextLine());
		System.out.println(sb.capacity()); // (OldCapacity * 2) + 2 used when we check capacity twice of same string

	}

}
