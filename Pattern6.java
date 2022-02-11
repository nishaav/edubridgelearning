package com;

public class Pattern6 {

	
	public static void main(String args[])
	{
		/*
		 * A
		 * A B 
		 * A B C 
		 * A B C D
		 * A B C D E
		 * 
		 * 
		 */
		
		for(char i='A';i<='E';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=65;i<=69;i++)
		{
			for(int j=65;j<=i;j++)
			{
				System.out.print((char)j);
			}
			System.out.println();
		}
		for(int i =1; i<=5; i++)
		{
		int abc = 65;
		for(int j=1; j<=i; j++)
		{
		System.out.print((char) abc++);
		}
		System.out.println();
		}

	}
}
