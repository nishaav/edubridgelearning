package encapsulation;
//Object class 
public class Encapsulation2 extends Object{

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		String str=new String("Java");
		A a=new A("Java");
		System.out.println(str);
		System.out.println(a);
		
		Employee emp=new Employee(12,"Nitin");
		Employee emp1=(Employee)emp.clone();
		
		System.out.println(emp.empId+" "+emp.name);
		System.out.println(emp1.empId+" "+emp1.name);
		
		System.out.println(emp);
		System.out.println(emp1);
	}
/*
 * every class in java is doing inheritance by default
 * Object class
 * ->It is a part of java.lang package
 * default package
 * Multiple inheritance is not supported through classes in java.
 * 
 * 
 */
}
class A
{
	String name;
	A(String name)
	{
		this.name=name;
	}
	
	public String toString()
	{
		return "Hii "+name;
	}
// clone() : duplicates
	//object cloning : creating the copy of the object of the class by overriding
	//the clone method.
	//exact copy of the object.
	//Why?
	// if we create the object using new keyword, it takes a lot of processing time 
	//of system to create the object and allocate memory.
	//by using cloning mechanism(clone() method),we can save the extra processing that
	//system needs to perform.
	//abstraction: interfaces	
}

class Employee implements Cloneable
{
	int empId;
	String name;
	
	Employee(int empId,String name)
	{
		this.empId=empId;
		this.name=name;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
