package com;

import java.util.Scanner;
public class Main7 {

	public static void main(String[] args) {
		//2-D array : array of arrays

		int ar[][]=new int[2][2];//row column
		
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				ar[i][j]=scanner.nextInt();
			}
		}
		
		for(int i=0;i<2;i++)
		{
			System.out.println("Address of "+i+" : "+ar[i]);
			for(int j=0;j<2;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		
		ar[0][0]=90;
		ar[0][1]=97;
		ar[1][0]=56;
		ar[1][1]=34;
		
		int ar1[][]= {{12,33},{67,78},{34,65}};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(ar1[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
