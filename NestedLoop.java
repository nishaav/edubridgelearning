package com;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Nested loop : Loop inside another loop
//		for(int i=1;i<=5;i++)//outer loop
//		{
//			for(int j=1;j<=2;j++)//inner loop
//			{
//				System.out.println("i:"+i+" j:"+j);
//			}
//		}
		
		outer:
		for(int i=1;i<=5;i++)//outer loop
		{
			inner:
			for(int j=1;j<=5;j++)//inner loop
			{
				System.out.println("i:"+i+" j:"+j);
				if(i>=3 || j==2)
				{
					break inner;
				}
			}
		}

	}

}
