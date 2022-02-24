package com1;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ins i=new Ins(5);
		i.show();
	}
/*
 * 
 * this keyword
 * ->works as a reference to the current class object
 * ->used to refer the current class member
 * 
 * 
 * to access the instance variable of the class within the class
 * to call the current class method within the class.
 * to invoke the constructor of the current class.
 */
}
class Ins
{
	int a;
	
	Ins()
	{
		System.out.println("Default Constructor");
	}
	Ins(int a)
	{
		this();//default constructor
		
		this.a=a;
		System.out.println("hello");
		
	}
	void show()
	{
		
		System.out.println(this.a);
	}
	void display()
	{
		this.show();
	}
	static void disp()
	{
		Ins i=new Ins();
		System.out.println(i.a);
	}
}