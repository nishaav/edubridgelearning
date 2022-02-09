package com;

public class Loop1 {

	public static void main(String args[])
	{
		for(int i=5;i<=1;i++)
		{
			System.out.println(i);
		}
		
		for(int i=1;i<=5;i--)
		{
			System.out.println(i);
		}
	}
	
}
/*
 * loop is not executing even once : means i have an issue in my condition.
 * 
 * loop is running infinite, issue in inc/dec point
 * 
 */
