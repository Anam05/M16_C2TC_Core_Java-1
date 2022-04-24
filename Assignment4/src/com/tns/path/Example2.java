package com.tns.path;

public class Example2 {

	static class Circle {
		
	    static int josephus(int n)
	    {
	        int p = 1;
	        while (p <= n)
	            p *= 2;
	 
	        return (2 * n) - p + 1;
	    }
	 
	    public static void main(String[] args)
	    {
	        int n = 16;
	 
	        System.out.println("The chosen place is "+ josephus(n));
	    }
	}
}
