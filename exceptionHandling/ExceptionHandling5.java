package exceptionHandling;

public class ExceptionHandling5 {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Hello User!!");
			String str="Hello";
			int len=str.length();
			int a=10/2;
			System.out.println("Unreachable code!!");	
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException  ae)
		{
			System.out.println("Technical Issue!!");
		}
		catch( NullPointerException | StringIndexOutOfBoundsException ne)
		{
			System.out.println("Support Team not available!!");
		}
		finally
		{
			System.out.println("End Of Program!!");
		}
	}
}