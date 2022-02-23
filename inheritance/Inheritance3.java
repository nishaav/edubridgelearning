package oops.inheritance;

public class Inheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D13 d13=new D13();
		d13.show();
		D12 d12=new D12();
		d12.display();
		d13.disp();
	}

}
class D11
{
	void show()
	{
		System.out.print("Welcome ");
	}
}
class D12 extends D11
{
	void display()
	{
		System.out.print("To ");
	}
}
class D13 extends D11
{
	void disp()
	{
		System.out.println("Edubridge");
	}
}