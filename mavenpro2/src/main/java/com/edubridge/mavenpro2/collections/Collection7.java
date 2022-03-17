package com.edubridge.mavenpro2.collections;

import java.util.*;
public class Collection7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet class
		/*
		 * HashSet
		 * ->duplicacy will not be allowed
		 * ->dynamically growable
		 * ->random order
		 * ->array of linkedlist
		 *
		 */
		
		
		HashSet<String> hs=new HashSet<>();
		
		hs.add("Nivedita");
		hs.add("Aparna");
		hs.add("Sunil");
		hs.add("Puneet");
		
		System.out.println(hs);
		
		hs.remove("Aparna");
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());
		
		System.out.println(hs.contains("Puneet"));
		
		HashSet<String> hs1=(HashSet<String>)hs.clone();
		hs1.add("Priya");
		System.out.println(hs1.equals(hs));//to check equality of 2 collections
		
		//traversing the collection using for loop
		//traversing the collection using enhanced for loop
		for(String str:hs1)
		{
			System.out.println(str);
		}
		//traversing the collection using SOP statement
		System.out.println(hs1);
		
		//traversing the collection using Iterator interface
		
		Iterator<String> itr=hs1.iterator();
		
		while(itr.hasNext())//checks whether the elements are left or not
		{
			System.out.println(itr.next());
		}
		
		
		
		
		

	}

}
