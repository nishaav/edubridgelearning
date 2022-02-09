package com;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
	
		int a=10;
		float b=a;//10.0 implicit conversion
		float f=29.8f;//98.6--> 98//explicit conversion
		int i=(int)f;//(datatype)variable_name;
		
		System.out.println(a);//10
		System.out.println(b);
		System.out.println(f);
		System.out.println(i);
		
		/*
		 * Narrowing Type Casting or Explicit Conversion : explicit conversion needs to be performed
		 * narrow : providing less space
		 * Widening Type Casting or Implicit Conversion : implicit conversion will take place.
		 * widen : providing more space.
		 * ------------>Widening Scale--------->
		 * byte-->short-->int-->long-->float-->double
		 * ----------->Narrowing Scale----------------->
		 * double--->float--->long--->int--->short-->byte
		 * 
		 * - - = +
		 */
			
		
		Scanner scan=new Scanner(System.in);
		//System.out.println("Enter a value :");
	//	int num=scan.nextInt();
//		if(num<0)
//		{
//			System.out.println("The Absolute Value for "+num +" is "+(-num));
//		}
//		else
//		{
//			System.out.println("The Absolute Value for "+num +" is "+num);
//		}
		
		
//		System.out.println("ENter the qty and price ");
//		int qty=scan.nextInt();
//		float price=scan.nextFloat();
//		float t_exp=qty*price;
//		System.out.println("Total Expense : "+t_exp);
//		float discount;
//		if(t_exp>5000)
//		{
//			discount=t_exp*0.1f;
//			//(t_Exp*10)/10010/100 0.1
//			System.out.println("Congratulations!! You have got a discount of Rs. "+discount);
//			System.out.println("Total Payable amount is "+(t_exp-discount));
//		}
//		else
//		{
//			System.out.println("Oops..Not eligible for discount");
//			System.out.println("Total Payable amount is "+t_exp);
//		}
		
		
//		System.out.println("Enter the Basic Salary : ");
//		double bSal=scan.nextDouble();
//		
//		double HRA=0,DA=0;
//		if((bSal<1500) && (bSal>=0))
//		{
//			HRA=bSal*0.1;
//			DA=bSal*0.9;
//		}
//		else if(bSal>=1500)
//		{
//			HRA=500;
//			DA=bSal*0.98;
//		}
//		else 
//		{
//			System.out.println("Invalid Input..Please check the input and try again!!");
//		}
//		
//		double grossSalary=bSal+HRA+DA;
//		if(grossSalary<=0)
//		{
//			
//		}
//		else
//		{
//			System.out.println("The Gross Salary is "+grossSalary);
//		}

			Scanner telephone = new Scanner(System.in);
			System.out.println("Mention the calls");
			double calls = telephone.nextDouble();

			if((calls>=0) && (calls<=100)) {

			double telephoneBill = 200;
			System.out.println("Telephone Bill is " + telephoneBill);
			}
			else if((calls>100) && (calls<=150))
			{
			double call = calls-100;//110-100 : 10
			double telephoneBill = 200+(call*0.60);
			System.out.println("Telephone Bill is " + telephoneBill);
			}
			else if((calls>150) && (calls<=200))
			{
			double call = calls-150;//160 100=200 50=0.6 10
			double telephoneBill = 200 + (50*0.60) + (call*0.50);
			System.out.println("Telephone Bill is " + telephoneBill);
			}
			else if(calls>200)
			{
			double call = calls-200;
			double telephoneBill = 200 + (50*0.60) + (50*0.50) + (call*0.40);
			System.out.println("Telephone Bill is :" +telephoneBill);
			}
			else
			{
				System.out.println("Invalid Input");
			}
			}
			}
