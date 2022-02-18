package com;

public class Main1 
{
public static void main(String args[])
{
/* Q.1
 *         1
 *       1 1 1 
 *     1 1 1 1 1
 *     
 *      
 *         *
 *       * * *
 *     * * * * *
 *     
 * Q.3    
 *         1
 *       1 * 1
 *     1 * 1 * 1
 *     
 *         1
 *       1 * 1
 *     1 * * * 1     
 * Q.5   
 *         1
 *       1 2 1
 *     1 2 3 2 1
 *     
 *     
 *         1
 *       2 1 2
 *     3 2 1 2 3    
      
 */
for(int i=1;i<=3;i++)
{
	for(int s=2;s>=i;s--)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=2*i-1;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
	
	
	
}
}
