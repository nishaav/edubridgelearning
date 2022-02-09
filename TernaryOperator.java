package com;

public class TernaryOperator {

	public static void main(String[] args) {
		//ternary operator or conditional operator
		//one line replacement for if-else block.
		//(condition) ? value_if_true : value_if_false;
		
		
		int a=10,b=20;
		if(a>b)
		{
			System.out.println(a+" is greater");
			
		}
		else
		{
			System.out.println(b+" is greater");
		}

		
		String str=(a>b)? a+" is greater" : b+" is greater";
		
		System.out.println(str);
	}

}
