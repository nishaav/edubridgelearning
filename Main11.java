package com;

public class Main11 {

	public static void main(String[] args) {
		// reverse the array 
		//input
		//12,23,44,65,76,78
		//output
		//78,76,65,44,23,12
		
		int  arr[] =  {12, 23, 44, 65, 76,78};  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++)
        {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
        System.out.println("Array in reverse order: ");  
         
        for (int i = arr.length-1; i >= 0; i--)
        {  
            System.out.print(arr[i] + " ");  
        }
	}
}
/*
 * CREATE THE PATTERN USING ARRAY : 
 * 
 * H E L L O
 * H E L L
 * H E L
 * H E 
 * H
 * H E 
 * H E L
 * H E L L
 * H E L L O
 * 
 * 
 * 
 * C
 * C O
 * C O B
 * C O B O
 * C O B O L
 * C O B O
 * C O B
 * C O 
 * C
 * 
 * FIND THE MOST REPETITVE NUMBER FROM THE ARRAY.
 * 
 * FIND ALL THE EVEN NUMBERS AND ODD NUMBERS FROM THE MAIN ARRAY AND CREATE TWO SEPERATE ARRAYS.
 * 67,43,23,12,34,56,76,45
 * 
 * TRANSPOSE THE 2X3 ARRAY INTO 3X2
 * INPUT
 * 12 34 54
 * 65 78 90
 * OUTPUT
 * 12 65
 * 34 78
 * 54 90
 * 
 */

