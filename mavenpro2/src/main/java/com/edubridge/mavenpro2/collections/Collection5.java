package com.edubridge.mavenpro2.collections;

import java.util.*;

public class Collection5 {
//Set is another interface
	//dynamically growable
	
	//LinkedHashSet-->
	//follows insertion order
	//TreeSet
	//HashSet
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("Neha");
		lhs.add("Priya");
		lhs.add("Pallavi");
		lhs.add("Himani");
		lhs.add("himani");
	
		System.out.println(lhs);
		
		System.out.println(lhs.size());
		System.out.println(lhs.contains("neha"));
		
		System.out.println(lhs.isEmpty());
		
		//System.out.println(lhs.remove(0));
		
		//cast set into list
		ArrayList<String> al=new ArrayList<>(lhs);
		
		Collections.sort(al);
		
		TreeSet<String> ts=new TreeSet<>(lhs);
		
		
		System.out.println(al);
		
		System.out.println(lhs.remove("Himani"));
		
		System.out.println(lhs);
		
		lhs.clear();
		System.out.println(lhs.isEmpty());
		
		System.out.println(ts);
		
	}

}
