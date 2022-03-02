package exceptionHandling;

public class ExceptionHandling4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//Arrays are treated as objects therefore 0 comes to be the default values
			//for int array
			int ar[]=new int[5];// 0 to 4
			ar[5]=20;//
			for(int a:ar)
			{
				System.out.println(a);
			}
			
			System.out.println("the array is of length : "+ar.length);
		}
		catch(ArithmeticException ae)//Specialised catch block
		{
			System.out.println("Arithmetic issue");
			ae.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)//specialized catch block
		{
			System.out.println("Array issue");
			e.printStackTrace();
		}
		catch(Exception e)//generalised catch block
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("End Of Program!!");
		}
	}
/*
 * try-catch
 * try-finally
 * try-catch-finally
 * try-multiple catch-finally
 * try-multi catch-finally
 * try-multi catch
 * try-multiple catch
 * 
 * 
 */
}
