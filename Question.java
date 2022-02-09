package com;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call call() method of Question class in main 
		call();
	}
	
	static void call()
	{
		//call display of User here
		User.display();
	}
}

class User
{
	int userId=10;
	static String courseName="JFS";
	
	void show()
	{
		System.out.println("Display user info");
	}
	static void display()
	{
		User user=new User();
		System.out.println(user.userId);
		System.out.println(courseName);
		//complete the method to call the member variables
	}
}