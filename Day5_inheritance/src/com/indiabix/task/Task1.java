//class for multilevel Inheritance

package com.indiabix.task;



class Principal
{
	void accept()
	{
		System.out.println("Fr. Pravin");
	}
}
class Teacher extends Principal
{
	void print()
	{
		System.out.println("Mr. Satish Nandgave");
	}
}
class Student extends Teacher
{
	void display()
	{
		System.out.println("Hritik Jain");
	}
}
public class Task1 {

	public static void main(String[] args) {
		Student obj=new Student();
		obj.accept();
		obj.print();
		obj.display();
	}
}
