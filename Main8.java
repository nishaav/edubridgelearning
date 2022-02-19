package com;
import java.util.Scanner;
public class Main8 {

	public static void main(String[] args) {
		//Find the number in the array and tell the position
		int ar[]= {23,43,54,234,542,234,544,233,65};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number to be searched : ");
		int search=scanner.nextInt();
		int position=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==search)
			{
				position=i+1;
				break;//jump statement
			}
		}
		if (position>0)
		{
			System.out.println("The element is found at "+position+" position");
		}
		else
		{
			System.out.println("Element not found");
		}

	}

}
