package com;

public class VariableExample {

	int c;//instance variable or non-static
	static int d;//static variable
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a;//declaration of local variable
		a=10;//initialization
		int b=10;//declaration alongwith initialization
		System.out.println(a);
		System.out.println("a");
		System.out.println("The value of a variable is "+a);//concatenation of string
		d=20;
		System.out.println("The value of static variable d is "+d);
	}
	
	void show()
	{
	
		d=10;
		System.out.println("The value of static variable is "+d);
	}

}
/*
 * Types of Variables :
 * 1)local variable : created inside the method and can be used inside the method only.
 * 2)instance variable : inside the class
 * 3)static variable : inside the class with a static keyword
 */



