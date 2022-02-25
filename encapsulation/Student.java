package encapsulation;
/*
 * 
 * Rule of making an encapsulated class :
 * 1)class must be in a package
 * 2)all the member variables must be private
 * 3)class may have setter and getter methods.
 * 
 */
public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	//to allocate the value to the variable.
	public String getStudentName() {
		return studentName;
	}
	//fetch the values of the variable.
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}	
}
