package exceptionHandling;

public class ExceptionHandling8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try
		{
			Vote vote=new Vote();
			//String str=null;
			//str.length();
			System.out.println("Welcome User!!");
			vote.check(-20);
			System.out.println("Hello User!!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
class Vote
{
	void check(int age)
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
			throw new ArithmeticException("Invalid Age");
		}
	}
}

