package oops.inheritance;

import java.util.Scanner;

public class Inheritance4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Employee emp = new Employee();

		System.out.println("Enter first name:");
		emp.fname = scanner.next();
		System.out.println("Enter Middle name:");
		emp.mname = scanner.next();
		System.out.println("Enter Last name:");
		emp.lname = scanner.next();

		System.out.println("Enter House Number:");
		emp.hno = scanner.next();
		System.out.println("Enter Pincode:");
		emp.pinCode = scanner.nextInt();
		scanner.nextLine();//blank statement to handle enter issue
		System.out.println("Enter City name:");
		emp.city = scanner.nextLine();

		System.out.println("Enter Employee Id:");
		emp.empId = scanner.nextInt();
		System.out.println("Enter Salary:");
		emp.salary = scanner.nextInt();
		System.out.println("Enter Bonus:");
		emp.bonus = scanner.nextInt();
		emp.show();

		}
}
class Name
{
	String fname,mname,lname;
}
class Address extends Name
{
	String hno;
	int pinCode;
	String city;
}
class Employee extends Address
{
	int empId;
	int salary;
	int bonus;
	
	void show()
	{
		System.out.println("Welcome "+fname+" "+mname+" "+lname+"!!");
		System.out.println("Please check your details : ");
		System.out.println("Address : " +hno +" " +pinCode + " " +city);
		System.out.println("EmpId : "+empId+" Total salary : Rs."+(salary+bonus));
	}
}