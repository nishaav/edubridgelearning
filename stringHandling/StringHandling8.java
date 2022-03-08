package stringHandling;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class StringHandling8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question: create a regex pattern to validate an email and a password
		//regex pattern to validate an email
		System.out.println("Enter a valid email : ");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();//string
		Pattern p1=Pattern.compile("^(.+)@(.+)$");//pattern a-zA-Z0-9
		Matcher m=p1.matcher(str);//
		boolean status=m.find();//it will look for the pattern 
		System.out.println(m.group());
		System.out.println(status);
		scan.close();
	//^: to mark the beginning of string
		//$: to mark the end of string
	}

}
