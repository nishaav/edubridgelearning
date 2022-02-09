package com;

import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
		// switch case: 
		// when we have to work on range : if logics
		// when we have direct value possibility : 
		// reduces complexity of code.
		// jump statements : those statements that transfers the control from one block of code to another block.
		// break is used to terminate the execution of block and move out for processing the remaining set of instructions.
		// break can be used with switch case and loops.
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a value : ");
		int i=scanner.nextInt();
		
			switch(i)
			{
				case 1: System.out.println("Pressed 1");
				break;
				case 2: System.out.println("Pressed 2");
				break;
				case 3: System.out.println("Pressed 3");
				break;
				case 4: System.out.println("Pressed 4");
				break;
				default:System.out.println("Invalid Input");
			}
		
		
			
	}

}
