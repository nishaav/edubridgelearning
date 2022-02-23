package oops.inheritance;

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			B b=new B();
			b.show();
			b.a=10;
			b.b=20;
			System.out.println("The value of a variable is "+b.a);
			System.out.println("The value of b variable is "+b.b);
			b.display();
			A a=new A();
			a.a=10;
			a.show();
	}
}

class A
{
	int a;
	void show()
	{
		System.out.println("Hello World!!");
	}
}

class B/*child class*/ extends A/*parent class*/
{
	int b;
	void display()
	{
		System.out.println("Hello Sample!!");
	}
}

/*
 * Inheritance : means when one object inherits all the properties of the parent object.
 * 
 * Code reusability : using the variables and methods of the parent class.
 * 
 * inheritance represents IS-A relationship which is also known as parent-child relationship.
 * 
 * in java, 3 types inheritance through classes:
 * 1)Single level : one parent having exactly one child class.
 * 2)Multi level : one parent having extactly one child class and child class having exactly one sub child class
 * 3)Hierarchial
 * 
 * keyword "extends" is used to apply inheritance.
 * 
 * Child class can use the properties of parent class but parent classes cannot use the properties
 * of child class
 * 
 * 
 * 
 */










