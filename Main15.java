package com;

public class Main15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {67,43,23,12,34,56,76,45};
		int even[]=new int[ar.length];
		int odd[]=new int[ar.length];
		//FIND ALL THE EVEN NUMBERS AND ODD NUMBERS FROM THE MAIN ARRAY AND CREATE TWO SEPERATE ARRAYS.
		int e=0,o=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				even[e]=ar[i];
				e++;
			}
			else
			{
				odd[o]=ar[i];
				o++;
			}
		}
		System.out.println("Even array : ");
		for(int i=0;i<even.length;i++)
		{
			System.out.print(even[i]+" ");
		}
		System.out.println();
		System.out.println("Odd array : ");
		for(int i=0;i<odd.length;i++)
		{
			System.out.print(odd[i]+" ");
		}
		
	
	}

}
