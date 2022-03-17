package com.edubridge.mavenpro2;

public class Student {

	String grade(int percentage)
	{
		if((percentage>90)&&(percentage<=100))
		{
			return "A";
		}
		else if(percentage>75 && percentage<=90)
		{
			return "B";
		}
		else if(percentage>60 && percentage<=75)
		{
			return "C";
		}
		else if(percentage>=0 && percentage<=60)
		{
			return "Fail";
		}
		else
		{
			return "Invalid";
		}
		
	}
	String result(int percentage)
	{
		if(percentage>=60)
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	boolean isEven(int num1)
	{
		if(num1%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}
