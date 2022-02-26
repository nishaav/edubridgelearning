package abstraction;

public class Abstraction4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			A2 a2=new A2();
			a2.display();
			a2.show();
	}

}
/*
 * 
 *Multiple inheritance cannot be achieved through classes.
	but through interfaces, we can apply multiple inheritance but it is referred as
	Multiple Interface implementation
	
	
 */
interface I1
{
	int a=90;
	void show();
}
interface I2
{
	void display();
}
class A2 implements I1,I2
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show method of interface I1");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display method of interface I2");
	}
	
}