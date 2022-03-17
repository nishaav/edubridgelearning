package com.edubridge.mavenpro2.collections;

import java.util.*;
public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Learner> al=new ArrayList<>();
		Learner l1=new Learner(1,"Rajshekhar",21);
		Learner l2=new Learner(2,"Rajesh",22);
		Learner l3=new Learner(3,"Priyanka",21);
		Learner l4=new Learner(4,"Jeyaprathap",22);
		
		al.add(l4);
		al.add(new Learner(5,"Priya",26));
		al.add(l1);
		al.add(l2);
		al.add(l3);
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		//to sort the user defined collection using Comparable interface
	}

}
class Learner implements Comparable<Learner>
{
	int id;
	String name;
	int age;
	public Learner(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public String toString()
	{
		return id+" "+name+" "+age;
	}
	@Override
	public int compareTo(Learner o) {
		// TODO Auto-generated method stub
//		if(id>o.id)
//		{
//			return 1;//positive integer means swapping
//		}
//		else if(id==o.id)
//		{
//			return 0;
//		}
//		else
//		{
//			return -1;
//		}
		
		return name.compareTo(o.name);
		
	}
	
	
}