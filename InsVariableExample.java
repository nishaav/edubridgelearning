package com;

public class InsVariableExample {
	//class member
	static int a;
	int c;
	public static void main(String[] args) {
		//classname referencevariable=new classname();
		InsVariableExample ins=new InsVariableExample();
		ins.c=20;
		
		System.out.println("The value of instance variable c is "+ins.c);
		a=10;
		System.out.println(a);
		show();
		ins.display();
	}
	static void show()
	{
		a=20;
		System.out.println(a);
	}
	
	void display()
	{
		a=20;
		System.out.println("Hello");
	}
}
