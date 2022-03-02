package exceptionHandling;

public class ExceptionHandling6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Start of program!");
			int i=10/0;
			System.out.println("Mid Of program!!");
		}
		finally
		{
			System.out.println("End Of Program!!");
		}
		System.out.println("Out of finally");
	}

}
