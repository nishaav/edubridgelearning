package com;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		//declaration
		int ar[]=new int[10];
		
		int[] ar1=new int[5];
		//initialization
		
		//user-initialization
		
		Scanner scanner=new Scanner(System.in);
		
//		ar[0]=scanner.nextInt();
//		ar[1]=scanner.nextInt();
//		ar[2]=scanner.nextInt();
//		ar[3]=scanner.nextInt();
//		ar[4]=scanner.nextInt();
		
		System.out.println("Enter 5 numbers : ");
		//length is  a function which will capture the length of the 
		//array
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scanner.nextInt();
		}
		
		System.out.println("The values of array are : ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		
	}

}
