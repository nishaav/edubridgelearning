package oops.accessModifier;

import java.util.Scanner;

import com.Access3;

public class Access1 extends com.Access3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		Demo demo=new Demo();
		demo.display();
		Demo2 demo2=new Demo2();
		System.out.println(demo2.a);
		demo2.show();
		
		Access2 access=new Access2();
		System.out.println(access.b);
		access.display();
		
		
	}

}
class Demo
{
	private int a;
	
	private void show()
	{
		System.out.println("private method show() "+a);
	}
	
	void display()
	{
		show();
	}
	/*
	 * private members can be accessed 
	 * 1) within the class only.
	 * 
	 */
}
class Demo2
{
	int a;
	
	void show()
	{
		System.out.println("default member show of class Demo2"+a);
	}
	/*
	 * default members can be accessed 
	 * 1) within the class
	 * 2) outside the class in same java program
	 * 3) outside the class in another java program within same package.
	 */
}




