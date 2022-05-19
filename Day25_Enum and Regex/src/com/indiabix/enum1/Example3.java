package com.indiabix.enum1;

enum Bike
{
	Pulsar,KTM,R3,R15,Honda;
}

public class Example3 {

	public static void main(String[] args) {
		Bike b=Bike.Honda;
		switch(b)
		{
		case Pulsar:
			System.out.println("You choose Pulsar");
			break;
		case KTM:
			System.out.println("You choose KTM");
			break;
		case R3:
			System.out.println("You choose R3");
			break;
		case R15:
			System.out.println("You choose R15");
			break;
			
		default:
			System.out.println("Invalid name");
			break;
		}

	}

}
