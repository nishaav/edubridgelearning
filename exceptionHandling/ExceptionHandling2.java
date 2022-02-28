package exceptionHandling;
import java.util.*;
public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//InputStream
		try
		{
			String str="hjh";
			System.out.println(str.length());
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			scan.close();
			System.out.println("End of Program!!");
		}
		//try-catch
		//try-catch-finally
		//try-finally
		//final and finally
		
		
		
	}

}
