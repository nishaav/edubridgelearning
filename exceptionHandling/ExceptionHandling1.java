package exceptionHandling;

import java.io.FileInputStream;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String str="Wrapper";
			int len=str.length();//length : 7 index : 0 to 6 
			System.out.println("start of program!!");
			System.out.println(len);//7
			System.out.println(str.charAt(len-1));//str.charAt(7);//it creates the object of the exception class
			//for which the exception is raised.
			System.out.println("Hello user!!");
		}
		catch(Exception e)//Exception e =new StringIndexOutOfBoundsException("statement of issue");
		{
			System.out.println("Server under maintenance");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("end of program!!");
		}
		
		
		//File connection
//		
		//FileInputStream fin=new FileInputStream("f1.txt");
		
		
		
	}

}
