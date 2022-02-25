package encapsulation;

public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student=new Student();
		student.setStudentId(89);
		student.setStudentName("Geetika");
		student.setStudentAddress("Janakpuri");
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentAddress());
	}
/*
 * 
 * final,this,super and access modifier
 * 
 * 
 * 
 * Encapsulation : capsule
 * 
 * is a process of wrapping the code into a single unit.
 * wrapping the data members and member methods
 * 
 * Encapsulated class
 * Why?
 * ease of accessibility
 * unit testing the code
 * faster than normal class.
 * data hiding : because other classes cannot access the data through the private member variables. 
 * 
 * object has a state(data/variables) and a behaviour(methods)
 * 
 * 
 * Rule of making an encapsulated class :
 * 1)class must be in a package
 * 2)all the member variables must be private : data hiding
 * 3)class may have setter and getter methods : 
 * READ ONLY WRITE ONLY 
 * 
 * 
 * 
 * 
 * Object class : 
 */
}




