package com.edubridge.mavenpro2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class StudentTest {

	@BeforeClass
	public static void show1()
	{
		System.out.println("Call Method Show1");
	}
	@AfterClass
	public static void show2()
	{
		System.out.println("Call Method Show2");
	}

	
	@Before
	public void testing1()
	{
		System.out.println("Hello User!!");
	}
	
	
	@Test
	public void testGrade()
	{
		Student student=new Student();
		String result=student.grade(90);
		assertEquals("B",result);
	}
	@Test
	public void testGrade1()
	{
		Student student=new Student();
		String result=student.grade(190);
		assertEquals("Invalid",result);
	}
	@Test
	public void testGrade2()
	{
		Student student=new Student();
		String result=student.grade(-9);
		assertEquals("Invalid",result);
	}
	
	@Test
	public void testResult()
	{
		Student student=new Student();
		String result=student.result(60);
		assertEquals("Pass",result);
		/*
		 * 1)create a method name result in student class 
		 * which is parameterised with int
		 * return type : String
		 * if(percentage>60 return pass else fail
		 * 
		 * ==
		 * equals
		 */
	}
	@Test
	public void testIsEven()
	{
		Student student=new Student();
		boolean result=student.isEven(90);
		assertTrue(result);//expecting the output of result to be true
	}
	@Ignore
	@Test
	public void testIsEven1()
	{
		Student student=new Student();
		boolean result=student.isEven(95);
		assertFalse(result);//expecting the output of result to be false
	}
	
	@After
	public void testing2()
	{
		System.out.println("End of Program!!");
	}
	
	
}
