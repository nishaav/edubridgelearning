package com.edubridge.mavenpro2.collections;

import java.util.*;

public class Collection8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stack in collection
		/*
		 * ->linear data structure
		 * ->LIFO or FILO
		 * Last In First Out
		 * First In Last Out
		 * 
		 * Stack extends Vector class which is a implementation of List Interface.
		 * 
		 * 
		 * 
		 */
		Stack<String> stack=new Stack<>();
		stack.push("History");
		stack.push("History");
		stack.push("Civics");
		stack.push("General Knowledge");
		stack.push("Economics");
		stack.push("EVS");
		
		System.out.println(stack);
		
		System.out.println(stack.size());
		
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println(stack.capacity());//total number of elements a collection can have as a default size.
		System.out.println(stack.elementAt(0));
		System.out.println(stack.empty());
		System.out.println(stack.isEmpty());
		System.out.println(stack.firstElement());
		System.out.println(stack.lastElement());
		
		
	}

}
