package exceptionHandling;
//Custom Exception or user-defined exception : 
/*
 * creating own exceptions by creating subclass of Exception class.
 * Why to inherit Exception class : so that system will treat the instance of class as an exception object.
 * 
 * 
 */
public class ExceptionHandling9 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Vote1 vote=new Vote1();
		try
		{
			vote.check(-87);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Invalid Age");
		}
	}

}
class InvalidAgeException extends Exception
{
	InvalidAgeException(String str)
	{
		super(str);
	}
}
class Vote1
{
	void check(int age) throws InvalidAgeException
	{
		if(age>=0 && age<=17)
		{
			System.out.println("Ineligible for voting");
		}
		else if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else 
		{
			throw new InvalidAgeException("Invalid Age by the user");
		}
	}
}