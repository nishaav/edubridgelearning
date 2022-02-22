package oops.constructorExamples;

public class Constructor6 {
	//Method overloading :
		//creating multiple methods with same name as well as return type and different parameters
		//by changing the count of parameters
		//by changing the type of parameters
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello");
System.out.println(true);
int a=10;
System.out.println(a);
float f=10.9f;
System.out.println(f);
Constructor6 cons=new Constructor6();
cons.add(10, 2);
cons.add(78.5f, 89.4f);
cons.add(74398d, 4637d);
cons.add("Edubridge ", "Learning");
		//method overloading
	}
	void add(int a,int b)
	{
		System.out.println(a+b);
	}

	void add(float a,float b)
	{
		System.out.println(a+b);
	}
	void add(double a,double b)
	{
		System.out.println(a+b);
	}
	void add(String a,String b)
	{
		System.out.println(a+b);
	}
}



//Inheritance : 
