package com;

public class Main16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * TRANSPOSE THE 2X3 ARRAY INTO 3X2
 * INPUT
 * 12 34 54
 * 65 78 90
 * OUTPUT
 * 12 65
 * 34 78
 * 54 90
 */
		int ar[][]= {{12,34,54},{65,78,90}};
		System.out.println("Main Array : ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Resultant Array : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(ar[j][i]+" ");
			}
			System.out.println();
		}
	}

}
