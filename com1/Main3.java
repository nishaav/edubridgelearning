package com1;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Kart kart=new Kart();
			kart.display();
	}

}
class Lens
{
	Lens(int a)
	{
		System.out.println("Constructor of the class Lens");
	}
	int a=10;
	void show()
	{
		System.out.println("Access");
	}
}
class Kart extends Lens
{
	Kart()
	{
		//super(5);
		super(4);
		System.out.println("Constructor of class Kart");
	}
	
	int a=20;
	void show()
	{
		System.out.println("Overridden");
	}
	void display()
	{
		System.out.println("display method of the class");
		System.out.println(this.a+" "+super.a);
		this.show();
		super.show();
	}
}
//super is used as a parent class object.
//super is used as a reference variable to refere parent class object.
//access the instance variable of parent class
//access the method of parent class