package com;

import java.util.Arrays;

public class Main14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//FIND THE MOST REPETITVE NUMBER FROM THE ARRAY.
		
		int ar[]= {10,5,2,10,7,3,10,8};
		Arrays.sort(ar);//1,1,1,2,3,5,7,8
		int max_count=1;
		int num=ar[0];
		int current_count=1;
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]==ar[i-1])
			{
				current_count++;
			}
			else
			{
				if(current_count>max_count)
				{
					max_count=current_count;
					num=ar[i-1];
				}
				current_count=1;
			}
		}
		if(current_count>max_count)
		{
			max_count=current_count;
			num=ar[ar.length-1];
		}
		System.out.println("The most repeatitive number is "+num);
		
	}

}
