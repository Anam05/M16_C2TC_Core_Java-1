package com.tns.decisionmaking;

public class Example3 {

	public static void main(String[] args) 
	{
		int age=15, weight=55;
		if(age>=12)
		{
			if(weight>=40)
			{
				if(weight<=110)
				{
					System.out.println("Eligible for bunjee jumping");
				}
				else 
				{
					System.out.println("Extra ropes will be added");
				}
			}
			else
			{
				System.out.println("Not eligible for bunjee jumping");
			}
		}
		else
		{
			System.out.println("Not eligible for bunjee jumping");
		}
			

	}

}
