package com;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a character : ");
		String str=scanner.next();
		char ch=str.charAt(0);
		if(((int)ch>=65 && (int)ch<=90)||((int)ch>=97 && (int)ch<=122))
		{
			switch(ch)
			{
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': System.out.println("Entered Character is a vowel");
			break;
			default: System.out.println("Entered Character is a consonant");
			}
		}
		else
		{
			System.out.println("Entered character is not an alphabet");
		}
		
		
		
		
		
		// if logic 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		String str1=sc.next();
		char ch1=str1.charAt(0);
			
					if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o'
						|| ch1 == 'u' || ch1 == 'A' || ch1 == 'E' || ch1 == 'I'
						|| ch1 == 'O' || ch1 == 'U')
					{
						System.out.println("It is a Vowel.");
					}
					else
					{
						System.out.println("It is a Consonant.");
				    }
				sc.close();	

		

	}

}
