package com;

import java.util.Scanner;
public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *  college  : 
 *    total aggregate 10+2 : 90 as well as PCM : 92  
 *    //satisfaction of multiple conditions are necessary : AND &&
 *    
 *    total aggregate 10+2: 95 or PCM : 95
 *    //either of the condition is satisfied,output should be generated : OR ||
 */
		System.out.println("Enter Total Aggregate in 10+2 : ");
		Scanner scanner=new Scanner(System.in);
		double percentage=scanner.nextDouble();
		System.out.println("Enter Total Aggregate Of PCM : ");
		double pcm=scanner.nextDouble();
		System.out.println("Total Aggregate is "+percentage);
		System.out.println("Total Aggregate of PCM is "+pcm);
		if(percentage>=90 || pcm>=92)
		{
			System.out.println("Eligible for Enrolment");
		}
		else
		{
			System.out.println("Not eligible for enrolment");
		}
		
		
	}

}
/*
 * 
 * 
 * 
 * 
 */
