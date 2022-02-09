package com;

public class SwappingTheNumbers {

	public static void main(String args[])
	{
//		//Using third variable : 
//		int a=10;
//		int b=20;
//		//a=20 b=10
//		System.out.println("Before Swapping : ");
//		System.out.println("a : "+a+" b : "+b);
////		int c=a;
////		a=b;
////		b=c;
//		System.out.println("After Swapping : ");
//		//System.out.println("a : "+a+" b : "+b);
//		//without using third variable
//		//+ and -
//		b=b-a;
//		//b=20-10==10
//		a=b+a;
//		//a=10+10==20
//		System.out.println("b : " +b+ "a : "+a);

		
//		for(int i=1;i<=5;i++)
//		{
//			System.out.println(i);
//		}
		//1 2 3 4 5      2 3 4 5
//		for(int i=1;i<=5;++i)
//		{
//			System.out.println(i);
//		}
//		
//		int a=5;
//		while(a>=1)//5-->4-->3-->2-->1-->0
//		{
//			System.out.println(a);//5 4 3 2 1
//			a--;//4 3 2 1 0
//		}
//		
		System.out.println("while");
		int a1=1;
		while(a1<1)
		{
			System.out.println(a1);
			a1++;
		}
			
		System.out.println("do-while");
		int b=1;
		do
		{
			System.out.println(b);
			b++;
		}while(b<1);
		
		
		//1 2 3 4 5     2 3 4 5  

	}
	
}
/*
 * LOOPING : EXECUTING THE SET OF INSTRUCTIONS REPEATIVELY.
 * ITERATION : PROCESS OF LOOPING
 * 
 * 
 * TYPES :
 * ->ENTRY CONTROL LOOP:CONDITIONS ARE JUDGED WHILE ENTERING INTO THE LOOP
 * --> FOR , WHILE
 * ->EXIT CONTROL LOOP:CONDITIONS ARE JUDGED WHILE EXIT FROM THE LOOP
 * -->DO-WHILE
 * 3 PARAMETERS :
 * 1) INITIALIZATION : INITIAL POINT : STARTING POINT OF LOOP.
 * 2) CONDITION : TERMINATING POINT : ENDING POINT OF LOOP.
 * 3) INCREMENTING/DECREMENTING : ++,--
 * 
 * SYNTAX : 
 * for(initialization;condition;inc/dec)
 * {
 * 	//set of statements;
 * }
 * 
 * syntax : 
 * initialization;
 * 
 *  while(condition)
 *  {
 *  	//set of statements;
 *  	inc/dec;
 *  }
 * 
 * do-while
 * 
 *  initialization;
 *  do
 *  {
 *  	set of statements;
 *  	inc/dec;	
 *  }while(condition);
 * 
 * 
 * 
 * 
 * 
 */
