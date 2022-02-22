package oops.constructorExamples;

public class Constructor4 {

	public static void main(String[] args) {
		Employee emp=new Employee(1,"Jatin");
//		emp.showDetails();
		System.out.println(emp.empId);//1
		System.out.println(emp.empName);//Jatin
		Employee emp1=new Employee(2,"Manisha");
//		emp1.showDetails();
		System.out.println(emp1.empId);//2
		System.out.println(emp1.empName);//Manisha
	}

}
class Employee
{
	int empId;
	String empName;
	
	Employee(int id,String name)
	{
		empId=id;
		empName=name;
	}
//	void showDetails()
//	{
//		System.out.println(empId+" "+empName);
//	}
}
