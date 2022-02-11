package com;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*

H 
H E 
H E L 
H E L L 
H E L L O
 * 
 * 
 */
		String str="HELLO";
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
		
	}

}
