package com.tns.multithreading;;
class Parent1 extends Thread
{
	public void run()
	{
		//Thread.sleep(1000);
		System.out.println("C2TC Program");
	}
	
}
public class Example2 {

	public static void main(String[] args) {
		Parent1 p=new Parent1();
		p.start();
		p.interrupt();
		
	}
}