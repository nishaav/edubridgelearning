package stringHandling;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHandling9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a valid email : ");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();//string
		Pattern p1=Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");//pattern a-zA-Z0-9
		Matcher m=p1.matcher(str);//
		boolean status=m.find();//it will look for the pattern 
		System.out.println(m.group());
		System.out.println(status);
		scan.close();
	}
}
