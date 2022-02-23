package oops.inheritance;

public class Inheritance5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Creta creta=new Creta();
		EON eon=new EON();
		creta.fuel();
		creta.mileage();
		
		eon.fuel();
		eon.mileage();
	}

}
/*
 * Overriding : to be performed between parent and child class.
 * providing the implementation to the method of parent class.
 * one can change the definition but not the structure.
 * Overriding is also known as Runtime polymorphism
 * 
 * 
 * Rules :
 * 1)There must be IS-A relationship applied.
 * 2)the method must be of same name as in parent class.
 * 3)the set of parameters must be same as in parent class.
 * 4)access modifier must be same or of higher scope.
 * 
 * 
 * scope chart
 * 
 * private-->default-->protected-->public
 */ 
class Hyundai
{
	void fuel()//default scope
	{
		System.out.println("There are 3 fuels options : ");
		System.out.println("1)Petrol 2)CNG 3)Diesel");
	}
	void mileage()
	{
		System.out.println("5-10 Km/ltr");
	}
}
class Creta extends Hyundai
{
	public void fuel()//overridden method
	{
		System.out.println("Diesel as a fuel option is available");
	}
	void mileage()//overridden method
	{
		System.out.println("8 km/ltr");
	}
}
class EON extends Hyundai
{
	public void fuel()//overridden method
	{
		System.out.println("PETROL as a fuel option is available");
	}
	void mileage()//overridden method
	{
		System.out.println("6 km/ltr");
	}
}
/*Polymorphism :
 * poly + morphos
 * poly: many
 * morphos : forms
 * multiple forms of a single entity.
 * 
 * creating multiple forms a methods.
 * Types :
 * ->Overloading or static polymorphism or compile time polymorphism : 
 * ->Overriding or dynamic polymorphism or runtime polymorphism
 */



