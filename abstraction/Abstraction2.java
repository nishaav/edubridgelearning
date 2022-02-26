package abstraction;

public class Abstraction2 {

	public static void main(String[] args) {
		
		Mobile onePlus=new OnePlus();//upcasting : casting the object of child into reference of parent
		onePlus.camera();
		onePlus.display();
		onePlus.price();
		onePlus.processor();
		onePlus.cover();
		//onePlus.display2();
	}
}
abstract class Mobile
{
	abstract void camera();
	abstract void price();
	abstract void display();
	abstract void processor();
	void cover()
	{
		System.out.println("Included");
	}
}
class OnePlus extends Mobile
{

	@Override
	void camera() {
		// TODO Auto-generated method stub
		System.out.println("16 MP Front Camera");
		System.out.println("64 MP Back Camera");
		
	}

	@Override
	void price() {
		// TODO Auto-generated method stub
		System.out.println("Rs.54k");
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("6.3 inches with notch");
	}

	@Override
	void processor() {
		// TODO Auto-generated method stub
		System.out.println("Snapdragon 825");
	}
	
	void display2()
	{
		System.out.println("End of Program!!");
	}
	
}
