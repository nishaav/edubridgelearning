package com;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 1 * * * 5
		 * 2 * 4 *
		 * * 3 * *
		 * 2 * 4 *
		 1 * * * 5
		
		 */
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
				{
					System.out.print(j+" ");
				}
				else if((i+j)==6)
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
