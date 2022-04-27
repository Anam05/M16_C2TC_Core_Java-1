package in.cg.strings;

import java.util.StringTokenizer;

public class Example5 {

	public static void main(String[] args) 
	{
		StringTokenizer st=new StringTokenizer("Lets Try This");
		while(st.hasMoreTokens())
		System.out.println(st.nextToken());

	}

}
