package com.edubridge.mavenpro2.collections;

import java.util.*;

public class Collection6 {
//Set is another interface
	//dynamically growable
	
	//TreeSet-->
	//follows sorted order
	//TreeSet
	//HashSet
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> lhs=new TreeSet<>();
		lhs.add("Neha");
		lhs.add("Priya");
		lhs.add("Pallavi");
		lhs.add("Himani");
		lhs.add("Himani");
	
		System.out.println(lhs);
		
		System.out.println(lhs.size());
		System.out.println(lhs.contains("neha"));
		
		System.out.println(lhs.isEmpty());
		
		//System.out.println(lhs.remove(0));
		
		
		System.out.println(lhs.remove("Himani"));
		
		System.out.println(lhs);
		
		lhs.clear();
		
		System.out.println(lhs);
		System.out.println(lhs.isEmpty());
		
	}

}
