package com;

import java.util.Scanner;

public class UserDefinedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner =new Scanner(System.in);
//		System.out.println("Enter two numbers : ");
//		int num1=scanner.nextInt();
//		int num2=scanner.nextInt();
//		
//		//call the method
//		System.out.println("Value of num1 "+num1);
//		System.out.println("Value of num2 "+num2);
//		Methods udm=new Methods();
//		//udm.add(num1, num2);
//		int result=udm.add(num1, num2);
//		System.out.println("The output of addition is "+result);
		
		
		
//		int a=10,b=20,c=-8;
//		
//		int result=(a++)+(++b)+(--c)+(++a)+(b--)+(++c);
//		System.out.println(result);
		
		
		//even odd
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num1=scanner.nextInt();
		if(num1%2 == 0)
		{
			System.out.println(num1+" is even");
		}
		else
		{
			System.out.println(num1+" is odd");
		}
			
		
		
		
		
		
	}
	/* 
	 *  value changes
	 *  a->10->11  ->12
	 *  b->20->21->20
	 *  c->-8->-9->-8
	 *  exp :10+21-9+12+21-8
	 * 
	 */
	
	
}
class Methods
{
	int add(int a, int b)
	{
		return (a+b);
	}
}
/*
 * Operators :
 * Operators are the symbols which helps to manipulate the value of operands(variables).
 * 
 * 
 * Types of operators : 
 * 1)Assignment Operator : assigning the values to the variables.
 *                       =(equals to)
 * 2)Arithmetic Operator :  helps to perform arithmetic operations.
 * 	+,-,/,*,%													                      
 *     / : (division) returns quotient 
 *     % : (modulus) returns remainder
 *     
 * 3)Arithmetic Assignment Operator :
 *  +=,-=,/=,*=,%=
 *  
 *  int a=10;
 *  a+=2; or a=a+2;
 *  
 *  4)Unary Operator : used with a single operand.
 *  (increment operator) : ++
 *  (decrement operator) : -- 
 *    
 *   two cases : pre-increment :++a 
 *   			post-increment :a++
 *   
 *   two cases : pre-decrement :--a
 *   			post-decrement :a--
 *       
 *       
 *  5)Comparison Operator or Relational Operator : will be used to compare the values of operands with each other.
 *  > : greater than
 *  < : less than
 *  >= : greater then equals to
 *  <= : less than equals to
 *  == : exactly equals to 
 *  != : not equals to 
 *  
 *  conditions 
 *  
 *  6) logical operator : used when we have to check satisfaction of multiple conditions
 *  && : AND
 *  || : OR
 *   ! : NOT
 *    
 *    
 *    college  : 
 *    total aggregate 10+2 : 90 as well as PCM : 92  
 *    //satisfaction of multiple conditions are necessary : AND &&
 *    
 *    total aggregate 10+2: 95 or PCM : 95
 *    //either of the condition is satisfied,output should be generated : OR ||
 *    
 *    
 *    
 *  
 *  conditions 
 *  
 *  decision making constructs : 
 *   if logics 
 *   1) simple if  :  
 *   syntax : if(condition)
 *   		  {
 *              //your code
 *            }
 *   2) if else 
 *   syntax : if(condition)
 *   		  {
 *              //your code
 *            }
 *            else
 *            {
 *               // your code
 *  		  }	                   
 *  
 *  
 *         
 * 
 *
 */


