package com.edubridge.mavenpro2.collections;

import java.util.Collections;
import java.util.LinkedList;

public class Collection4 {
//ArrayList -> dynamic array structure
//LinkedList -> node ->doubly linked list 
//manipulation 
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<>();
		list.add("Rajshekhar");
		list.add("Priyanka");
		list.add("Makani");
		list.add("Rajesh");
		System.out.println(list);
		
		System.out.println("Using for loop : ");
		for(int i=0;i<list.size();i++)//size : counts the number of objects in the collection
		{
			System.out.println(list.get(i));//get : fetch the object from the specified index.
		}
		list.add(1, "Aparna");
		System.out.println("Using for loop : ");
		for(int i=0;i<list.size();i++)//size : counts the number of objects in the collection
		{
			System.out.println(list.get(i));//get : fetch the object from the specified index.
		}
		list.remove(0);//index
		System.out.println("Using for loop : ");
		for(int i=0;i<list.size();i++)//size : counts the number of objects in the collection
		{
			System.out.println(list.get(i));//get : fetch the object from the specified index.
		}
		list.remove("Rajesh");
		System.out.println(list);
		System.out.println(list.contains("Priya"));
		System.out.println(list.indexOf("RajShekhar"));
		//if the element is not found in the collection, indexOf method will result in -1 as an o/p.
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		
		//clone: means making an exact copy of the collection and its current elements.
		
		LinkedList<String> list1=(LinkedList<String>)list.clone();
		System.out.println(list1);
		
		list.add("Nisha");
		System.out.println(list);
		System.out.println(list1);
		
		//addAll():add all the objects of 1 collection into the another.
		
		LinkedList<String> list3=new LinkedList<String>();
		list3.add("Chamundeswari");
		list3.addAll(list1);
		System.out.println(list3);
		
		list3.set(3, "Priya");
		System.out.println(list3);
		
		//Deque 
		/*
		 * -> Double ended queue
		 * ->both the ends are applicable for insertion and deletion.
		 * Queue : FIFO(First In First Out)
		 * (FCFS)->First Come First Served.
		 * e.g. standing in a queue
		 * 
		 * 
		 * 
		 * 
		 */
		
		list3.addFirst("Shraddha");
		list3.addLast("Arpana");
		System.out.println(list3);
		System.out.println(list3.getFirst());//throws an exception if collection is empty
		System.out.println(list3.getLast());//throws an exception if collection is empty
		System.out.println(list3.element());//first element
		System.out.println(list3.peek());//first element
		System.out.println(list3.peekFirst());//return null if collection is empty.
		System.out.println(list3.peekLast());//return null if collection is empty.
		System.out.println(list3.pollFirst());//return null if collection is empty.
		System.out.println(list3.pollLast());//return null if collection is empty.
		System.out.println(list3.removeFirst());//throws an exception if collection is empty
		System.out.println(list3.removeLast());//throws an exception if collection is empty
		
		//Question 
		/*
		 * find the duplicate elements from the collection.
		 * number of occurences.
		 */
		
		
		
	}

}
