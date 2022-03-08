package stringHandling;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stringhandling11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("lowercase : "+countElements("Admin@123","[a-z]"));
		System.out.println("uppercase : "+countElements("Admin@123","[A-Z]"));
		System.out.println("digits : "+countElements("Admin@123","[0-9]"));
		System.out.println("special symbols : "+countElements("Admin@123","[!@#$%^.-]"));
	}
	
	static int countElements(String str,String pattern)
	{
		Pattern p=Pattern.compile(pattern);//pattern
		Matcher m=p.matcher(str);//
		int count=0;
		while(m.find())
		{
			count++;
		}
		return count;
	}

}
