package abstraction;

public class Abstraction3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop hp=new HP();//upcasting
		hp.graphicCard();
		hp.hardDisk();
		hp.ram();
		hp.processor();
		//hp.show();
	}

}
interface Laptop
{
	void hardDisk();
	void processor();
	void graphicCard();
	void ram();
}
class HP implements Laptop
{

	@Override
	public void hardDisk() {
		// TODO Auto-generated method stub
		System.out.println("1 TB SSD");
	}

	@Override
	public void processor() {
		// TODO Auto-generated method stub
		System.out.println("Intel core processor");
	}

	@Override
	public void graphicCard() {
		// TODO Auto-generated method stub
		System.out.println("3 GB CG");
	}

	@Override
	public void ram() {
		// TODO Auto-generated method stub
		System.out.println("16 GB RAM");
	}
	void show()
	{
		System.out.println("Offer 15% off ");
	}
	
}