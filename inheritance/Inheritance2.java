package oops.inheritance;

public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D3 d3=new D3();
		d3.show();
		d3.display();
		d3.disp();
	}

}
class D1
{
	void show()
	{
		System.out.print("Welcome ");
	}
}
class D2 extends D1
{
	void display()
	{
		System.out.print("To ");
	}
}
class D3 extends D2
{
	void disp()
	{
		System.out.println("Edubridge");
	}
}