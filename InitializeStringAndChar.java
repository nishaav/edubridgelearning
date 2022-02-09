package com;
import java.util.Scanner;
public class InitializeStringAndChar {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//INITIALIZE STRING
		//TWO WAYS
		//1)next() or 2)nextLine()
		//System.out.println("Enter Your Name : ");
		//String name=scanner.nextLine();// will get terminated on enter key press
		//nextLine(): will read the input till the  enter command is pressed.
		//String name=scanner.next();// will get terminated on getting space
		//next(): will read the input till the space.
		//System.out.println("The name is "+name);
		
		
		//INITIALIZE CHAR
		//NO DIRECT METHOD
		
		System.out.println("Enter a character : ");
		String str=scanner.next();
		char ch=str.charAt(0);
		System.out.println("The word is "+str);
		System.out.println("The character is "+ch);
	}

}
