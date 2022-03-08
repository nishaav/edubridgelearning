package stringHandling;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHandling10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//password validation
		/*
		 * 1)length of password must be between 8 to 15 characters
		 * 2)should contain atleast 1 digit
		 * 3)one uppercase letter should be there
		 * 4)one lowercase letter should be there
		 * 5)no whitespaces are allowed
		 * 6)1 special symbols from the specified ones(!@#$%^-.)
		 * 
		 * Admin@123
		 * uppercase : 1
		 * lowercase : 4
		 * symbol : 1
		 * digit : 3
		 * 
		 */
		
		System.out.println("Enter a valid password : ");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();//string
		Pattern p1=Pattern.compile("^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^.-])(?=\\S+$).{8,15}$");//pattern a-zA-Z0-9
		Matcher m=p1.matcher(str);//
		boolean status=m.find();//it will look for the pattern 
		System.out.println(m.group());
		System.out.println(status);
		scan.close();
		//matches group find 
		//if logic
	}

}
