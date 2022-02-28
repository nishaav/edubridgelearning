package exceptionHandling;

import java.util.*;
public class ExeptionHandling3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		try
		{
		System.out.println("Enter two number to divide : ");
		
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println(num1/num2);
		}
		catch(Exception e)
		{
			System.out.println("Please provide a valid number");
		}
		finally
		{
		
		scan.close();
		}
	}

}
