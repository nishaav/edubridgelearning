package exceptionHandling;

public class ExceptionHandling7 {

	public static void main(String[] args) throws Exception {
		
		
		String str="Wrapper";
		int len=str.length();//length : 7 index : 0 to 6 
		System.out.println("start of program!!");
		System.out.println(len);//7
		System.out.println(str.charAt(len));//str.charAt(7);//it creates the object of the exception class
		//for which the exception is raised.
		System.out.println("Hello user!!");
		/*
		 * throw and throws are keywords
		 * throw
		 * -> used to raise the exception explicitly/manually.
		 * -> throw can be used to raise only unchecked exceptions.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * throws
		 * ->used for exception declaration along with the methods
		 * ->it can declare both the types of exceptions:checked and unchecked
		 * exception declaration 
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
