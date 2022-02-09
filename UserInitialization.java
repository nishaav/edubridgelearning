package com;

import java.util.Scanner;

public class UserInitialization 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a int value : ");
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		System.out.println("Enter a float value : ");
		float f=scanner.nextFloat();
		System.out.println("Enter a double value : ");
		double d=scanner.nextDouble();
		System.out.println("Value of int : "+a);
		System.out.println("Value of float : "+f);
		System.out.println("Value of double : "+d);
	}
}
/*
 * Scanner class :
 * ->to take inputs from user and pass them to variables created inside RAM, we need to use the methods of Scanner class.
 * ->java.util package needs to be imported.
 * 
 * nextInt() : to initialize int variable
 * nextLong() : to initialize long variable
 * nextFloat() : to initialize float variable
 * nextDouble() : to initialize double variable
 * next(): to initialize a string without space.
 * nextLine() : to initialize a string including spaces.
 * 
 * 
 * 
 */
