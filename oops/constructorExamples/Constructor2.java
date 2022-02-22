package oops.constructorExamples;
import java.util.Scanner;
public class Constructor2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();//object is created
		Scanner scanner=new Scanner(System.in);//object for scanner is created
		System.out.println("Do you want to check your eligibility for the programme :");
		System.out.println("Press Y for Yes and N for No : ");
		char ch=scanner.next().charAt(0);
		if(ch=='Y')
		{
			System.out.println("Enter your percentage : ");
			double d=scanner.nextDouble();
			student.checkEligibility(d);//explicit call
		}
		else
		{
			System.out.println("Thank you for visiting the portal!!");
		}
	}
}
class Student
{
	Student()
	{
		System.out.println("Welcome Student");
	}
	void checkEligibility(double per)
	{
		if(per>=90)
		{
			System.out.println("You are eligible");
		}
		else
		{
			System.out.println("You are not eligible");
		}
	}	
}