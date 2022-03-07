package stringHandling;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHandling7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aran@123";//string
		Pattern p=Pattern.compile("[a-p]{8,15}");//pattern
		//Pattern p1=Pattern.compile("[0-9]{3}");//pattern
		Pattern p1=Pattern.compile("\\w{3}");//pattern a-zA-Z0-9
		Matcher m=p1.matcher(str);//
		boolean status=m.find();//it will look for the pattern 
		System.out.println(m.group());
		//starting from the beginning till the end of the string.
		System.out.println(status);
		//Question: create a regex pattern to validate an email and a password
		
	}

}
