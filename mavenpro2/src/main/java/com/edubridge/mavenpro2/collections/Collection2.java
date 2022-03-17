package com.edubridge.mavenpro2.collections;
import java.util.*;
public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(23);
		al.add(Integer.valueOf(25));
		al.add(150);
		al.add(15);
		al.add(55);
		al.add(45);
		al.add(35);
		al.add(0);
		System.out.println(al);
		al.remove(Integer.valueOf(25));
		al.remove(Integer.valueOf(0));
		System.out.println(al);
		Collections.sort(al);
		/*
		 * Collection : interface of hierarchy
		 * Collections : class
		 * 
		 * 
		 */
		
		
		
	}

}
