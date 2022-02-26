package abstraction;

public class Abstraction5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//java 8 
interface MyInterface
{
	void show();
	//default keyword is added in java 8 through which we can create non-abstract methods
	//inside the interfaces
	
	default void display()//non-abstract method
	{
		System.out.println("definition to interface method");
	}
}
/*
 * 1)for abstract classes, we use extends keyword whereas for interfaces, we use implements keyword
 * 2)by default the member variables of interfaces are final whereas the member variables of abstract classes are not final by default.
 * 3)to achieve multiple inheritance, interfaces are helpful whereas the abstract classes cannot help to achieve multiple inheritance.
 */



