package com;

import java.util.Scanner;

public class Pattern2 {

public static void main(String[] args)
{
/*
 * 
1 * * * *
* 2 * * *
* * 3 * *
* * * 4 *
* * * * 5


 * 
 * 
 */
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i==j)
			{
				System.out.print(j+" ");
			}
			else
			{
				System.out.print("* ");
			}
		}
		System.out.println();
	}
	
	
	
}
}

