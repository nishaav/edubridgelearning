package com;
//in one java program, only one class can be public.
//the name of program depends upon the public class name.
public class CallingMemberInDiffClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Demo.b);//class name as a reference.	
		Demo.show();//class name as a reference
		CallingMemberInDiffClass cm=new CallingMemberInDiffClass();
		cm.show();
		
		//non-static to static 
		Demo demo=new Demo();//instance or object
		System.out.println(demo.a);
		demo.display();
	}
	void show()
	{
		//Object of Demo class needs to be created as we are trying to access the member od Demo class.
		Demo demo=new Demo();
		System.out.println(demo.a);
		demo.display();
		//static to non-static of different class
		System.out.println(Demo.b);
		Demo.show();
		
	}
	
}
class Demo
{
	int a=10;//non-static 
	static int b=20;//static variable
	
	void display()//non-static
	{
		System.out.println("Hello User!!");
	}
	
	static void show()//static method
	{
		System.out.println("Static member of Demo class");
	}
}
