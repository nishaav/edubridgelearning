package com;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		   1
 *       1 2 1
 *     1 2 3 2 1
		 * 
		 * 	
		 */
		for(int i=1;i<=3;i++)
		{
			for(int s=2;s>=i;s--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int l=(i-1);l>=1;l--)
			{
				System.out.print(l);
				
			}
			
			System.out.println();
		}
		
	}

}
