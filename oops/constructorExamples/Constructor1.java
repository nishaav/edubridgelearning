package oops.constructorExamples;

public class Constructor1 {

	Constructor1(int a,String name)//default constructor
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Constructor1 cons=new Constructor1(2,"Nisha");
		//ClassName referencevariable=new ConstructorOfClass
		cons.show();
		
		
		
	}
	void show()
	{
		System.out.println("World!!");
	}

}
/*
 *Constructor 
 *
 *1)constructors are specially functions/methods
 *2)especially designed for the initialization of member variables(instance variables)
 *3)used to initialize the object. 
 *4)because it gets invoked/called automatically whenever you are creating 
 *an object for the class. 
 *
 *Types :
 *Default Constructor/Non-parameterised : automatically created by the compiler
 *
 *Parameterised : which needs to be created by developer as per requirement.
 * NOTE : but if developer will create the constructor(default/parameterised),
 * then compiler will not create the same.
 *To create a constructor :
 *1)Name :constructor is named as per the class Name
 *2)Return Type : no return type
 *
 *
 */
