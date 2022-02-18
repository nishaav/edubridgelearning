package com;

public class Main5 {

	public static void main(String[] args) {
		/*
		 * 
 *	       1
 *       2 1 2
 *     3 2 1 2 3  
 *     
		 */
		
		for(int i=1;i<=3;i++)
		{
			for(int s=2;s>=i;s--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print(l);
			}
			
			System.out.println();
		}

	}

}
