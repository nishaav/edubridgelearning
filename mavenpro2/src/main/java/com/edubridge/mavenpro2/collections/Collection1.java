package com.edubridge.mavenpro2.collections;

import java.util.*;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//framework : 
		//readymade architecture
		//classes and interfaces
		//Collections with generics
		//generics : type safety was ensured.
		
		//mandatory to specify at left side.
		
		//default capacity of ArrayList is 16
		//dynamic array as a structure.
		//insertion order is maintained.
		
		//to add objects into the collections
		ArrayList<String> al=new ArrayList<String>();
		al.add("Makani");//0
		al.add("Shrusti");//1
		al.add("Priyanka");//2
		al.add("Rajesh");//3
		al.add("Rajshekhar");//4
		al.add("Jeyaprathap");//5
		al.add("Pavithra");//6
		//using for loop
		System.out.println("Using for loop : ");
		for(int i=0;i<al.size();i++)//size : counts the number of objects in the collection
		{
			System.out.println(al.get(i));//get : fetch the object from the specified index.
		}
		al.add(1, "Aparna");
		System.out.println("Using for loop : ");
		for(int i=0;i<al.size();i++)//size : counts the number of objects in the collection
		{
			System.out.println(al.get(i));//get : fetch the object from the specified index.
		}
		al.remove(0);//index
		System.out.println("Using for loop : ");
		for(int i=0;i<al.size();i++)//size : counts the number of objects in the collection
		{
			System.out.println(al.get(i));//get : fetch the object from the specified index.
		}
		al.remove("Rajesh");
		System.out.println(al);
		System.out.println(al.contains("Priya"));
		System.out.println(al.indexOf("RajShekhar"));
		//if the element is not found in the collection, indexOf method will result in -1 as an o/p.
		Collections.sort(al);
		System.out.println(al);
		System.out.println(al.isEmpty());
		
	}

}

