package com;

import java.util.Arrays;
import java.util.Scanner;
public class Main17 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
/*
 * Searching :
 * 1)Linear Search : 
 * the search will continue till the element found or till the length
 * 	1)best case : 
 * 	2)average case : 
 *  3)worst case : 
 * 2)Binary Search : 
 * mandation: array should be sorted
 * 
 */
		int ar[]= {12,78,7,86,9,52,76};
		System.out.println("Unsorted Array:");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		Arrays.sort(ar);
		System.out.println("Sorted Array:");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number to be searched : ");
		int num=scanner.nextInt();
		int result=binarySearch(ar,num);
		if(result==-1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element "+num+" found at "+result+" index");
		}
		
	}
	static int binarySearch(int ar[],int num)
	{
		int lb=0,ub=ar.length-1,mid=0;
		while(lb<=ub)
		{
			mid=(lb+(ub-lb)/2);
			if(ar[mid]==num)
			{
				return mid;
			}
			if(ar[mid]<num)
			{
				lb=mid+1;
			}
			else
			{
				ub=mid-1;
			}
			
		}
		return -1;
	}

}
