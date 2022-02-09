package com;

public class UserDefinedMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show();
		int output=add(2,3);	
		System.out.println(output);
		System.out.println(add(12,13));
		getNumber();

	}
	static void show()//default method
	{
		System.out.println("Hello User!!");
	}
	
	static int add(int a,int b)//parameterised method
	{
		return (a+b);
		
	}
	static int getNumber()//non parameterised method of return type int
	{
		return 1;
	}
	
}
/*
 *User defined methods :
 *
 * Method : executable block of code.
 * how to create user-defined methods :
 * 1)return type
 * 2)parameters
 * 3)static and non-static 
 * 
 * 
 * default or parameterised
 * 
 * syntax : 
 *variable creation :  datatype variablename
 * 
 * method : returntype methodName()//default method or non-parameterised
 * 			{
 * 			//your code
 * 			}
 * 
 * method : parameterised
 * syntax : returntype methodname(list of parameters)
 * 			{
 * 				//your code
 * 			}
 * 			
 */


