package encapsulation;

public class Abstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dummy dummy=new Dummy();
		dummy.show();
	}

}
/*Abstraction is a process of hiding the implementation details and showing
 *the necessary functionality to the user.
 * 
 *->reduce the complexity.
 *
 * two ways to achieve abstraction:
 * abstract classes :
 * interfaces :
 * 
 * abstract class:
 * ->declared with abstract keyword.
 * ->abstract method and non-abstract method.
 * ->we cannot create the object of abstract class.
 * ->classes can have constructor and static methods.
 * 
 * 
 */
abstract class Demo
{
	void show()//non-abstract
	{
		System.out.println("fjghj");
	}
	abstract void display();//abstract methods without body
}
class Dummy extends Demo
{
	void display()
	{
		System.out.println("Hello User!!");
	}
}

abstract class Car
{
	abstract void interior();
	abstract void exterior();
	abstract void fuel();
	abstract void steering();
	abstract void internalSpace();
	abstract void engine();
	abstract void stereo();
	void price()
	{
		System.out.println("Rs.8L");
	}
}
class Creta extends Car
{

	@Override
	void interior() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void exterior() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void fuel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void steering() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void internalSpace() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void engine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void stereo() {
		// TODO Auto-generated method stub
		
	}
	
}

interface I
{
	//all methods as abstract 
	void show();//public abstract
	void display();
}
class C implements I
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}





