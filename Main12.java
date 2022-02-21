package com;

public class Main12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * H E L L O
 * H E L L
 * H E L
 * H E 
 * H
 * H E 
 * H E L
 * H E L L
 * H E L L O
 */
		
		char ch[]= {'H','E','L','L','O'};
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<=4-i;j++)
			{
				System.out.print(ch[j]);
			}
			System.out.println();
		}
		for(int i=ch.length-2;i>=0;i--)
		{
			for(int j=0;j<=4-i;j++)
			{
				System.out.print(ch[j]);
			}
			System.out.println();
		}
	}

}
