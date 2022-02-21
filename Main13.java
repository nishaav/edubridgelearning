package com;

public class Main13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 
 * C
 * C O
 * C O B
 * C O B O
 * C O B O L
 * C O B O
 * C O B
 * C O 
 * C
 * 
 * 1
 * 1 2 
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
		 */
		
		char ch[]= {'C','O','B','O','L'};
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch[j]);
			}
			System.out.println();
		}
		for(int i=ch.length-2;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch[j]);
			}
			System.out.println();
		}
	}

}
