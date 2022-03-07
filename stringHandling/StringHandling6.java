package stringHandling;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class StringHandling6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="xyz@123";//string
		Pattern p=Pattern.compile("\b[^a-p]");//pattern
		Matcher m=p.matcher(str);//
		
		boolean status=m.find();//it will look for the pattern 
		//starting from the beginning till the end of the string.
		System.out.println(status);
		
		/*
		 * Regex Character classes :
		 * [abc]:any character of the specified ones.
		 * [a-p]:any character from this range.
		 * [^abc]:any character other than specified ones.
		 * [^a-p]:any character other than the specified range.
		 * [a-zA-Z]:any character from smaller case letter and upper case letter.
		 * [a-d[m-p]]:a through d or m through p.
		 * [a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z]
		 * 
		 * [a-zA-Z]{8}
		 * Regex Quantifiers:
		 * it is used to specify the number of occurences of a character
		 * [abc]?:means any one of the three occurs once or not at all.
		 * [abc]+:means pattern occurs once or more times.
		 * [abc]*:means pattern occurs zero or more times.
		 * [abc]{8}:pattern occurs n times only.
		 * [abc]{n,}:pattern occurs n or more times.
		 * [abc]{n,m}:pattern occurs atleast n times but less than m times.
		 * 
		 * Regex Metacharacters :
		 * special symbol and shortcodes :
		 * .:Any character/digit/symbol
		 * \d:any digit or[0-9]
		 * \D:any non-digit
		 * \s:any whitespace character
		 * \S:any non-whitespace character
		 * \w: any word character it is a shortcode for [a-zA-Z0-9] except special symbols
		 * \W:any non-word character,short for[^\w]. except [a-zA-Z0-9].
		 * \b:looks for boundary word.
		 * \B:a non-boundary word.
		 * 
		 * 1980
		 * \\d{4}
		 * \\d
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
	}

}
