package com;

public class Main3 {

	public static void main(String[] args) {
		/*     
		   
		   1
 *       1 * 1
 *     1 * * * 1
 */
		
		
		for(int i=1;i<=3;i++)
		{
			for(int s=2;s>=i;s--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(j==1 || j==2*i-1)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
