package oops.constructorExamples;

public class Constructor5 {
//constructor overloading :
	//creating multiple constructors with different parameters
	//by changing the count of parameters
	//by changing the type of parameters
	
	
	
	Constructor5()
	{
		System.out.println("Welcome User!!");
	}
	Constructor5(int a,int b)
	{
		System.out.println("The addition output is "+(a+b));
	}
	Constructor5(String str,String str1)
	{
		System.out.println(str+" "+str1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor5 cons1=new Constructor5();
		Constructor5 cons2=new Constructor5(1,4);
		Constructor5 cons3=new Constructor5("Edubridge","Learning");
	}

}
