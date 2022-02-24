package com1;

import foo.Access;
import foo.Access4;

public class Main1 extends Access{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main1 main=new Main1();
		main.display();
		Access4 access=new Access4();
		System.out.println(access.a);
		access.show();
		final int b=10;
	}
	
	public void display()
	{
		System.out.println(a);
		show();
	}

}
final class A
{
	final void show()
	{
		System.out.println("show");
	}
}
//class B extends A
//{
//	
//}

/*final
 * 
 * final is added jdk 1.5 
 * const has been replaced by final
 * final keyword is used to add the restrictions
 * 1)variable : it will be made constant means we cannot reinitialize the variable.
 * 2)method : overriding will not be allowed.
 * 3)class : inheritance is avoided
 * */


