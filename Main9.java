package com;

public class Main9 {

	public static void main(String[] args) {
		// search for the highest element of the array
		// as well as the index of the element.
		
		int a[] = new int[] { 32,54,65,76,89,70,678,90 };
		int max = a[0];//32
        int index = 0;
       for (int i = 0; i < a.length; i++) 
       {
               if (max < a[i]) //32 54
               {
                    max = a[i];//54
                   index = i;//1
                   
               }
       }
       
   System.out.println("Index of largest value "+max+" in an array is  :  " + index);
	}

}
