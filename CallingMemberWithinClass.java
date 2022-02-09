package com;

public class CallingMemberWithinClass {

	int a=10;//non-static or instance variable
	static int b=20;
	
	static void call()
	{
		System.out.println("Hello User!!");
	}
	
	void show()//user-defined method
	{
		System.out.println("Welcome User!!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(b);
		call();
		//non-static to static of same class
		//Object creation is mandatory
		//className referencevariable=new className();
		CallingMemberWithinClass cm=new CallingMemberWithinClass();
		System.out.println(cm.a);
		cm.display();
		cm.show();
		
	}

	void display()
	{
		System.out.println(a);
		show();
		//static to non-static
		System.out.println(b);
		call();
	}
	
}
