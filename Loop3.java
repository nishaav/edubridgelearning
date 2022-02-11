package com;

public class Loop3 {

	public static void main(String[] args) {

		
//		for(;;)
//		{
//			System.out.println("Hello");
//		}
		
		
		int i=1;//initialized
//		for(;i<=5;i++)
//		{
//			System.out.println(i);
//		}
//
//		for(i=1;i<=5;i++)
//		{
//			System.out.println(i);
//		}
		
		
		//labelled loop :
		
		outer:
			for(;i<=5;i++)//1-->2-->3
			{
				System.out.println(i);//1-->2-->3
				if(i>=3)
				{
					System.out.println("Terminating");
					break outer;
				}
			}
		
		
	}

}
