package stringHandling;
import java.util.regex.*;
public class StringHandling5 {
//regex : regular expressions
	//password 
	//Uppercase
	//lowercase
	//digit
	//special symbols (@#$!)
	//8-15 character
	
	//Admin@123
	//admiN@13a
	/*
	 * API(Application Programming Interface) 
	 * an additional library through which 
	 * one can perform the desired task.
	 * 
	 * 
	 * 3 classes and 1 interface
	 * 1)Matcher class : which is used to perform matching operations
	 * MatchResult interface is implemented by the Matcher class
	 * 2)Pattern class : used to make the regular expressions
	 * 3)MatchResult interface : interface implemented by Matcher 
	 * which provides a set of methods for matching over a string.
	 * 4)PatternSyntaxException class : exception instance that can be 
	 * encountered in case of exception raised related to pattern syntax.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[abc]","abc"));
		System.out.println(Pattern.matches("[abc]","b"));
		System.out.println(Pattern.matches("[ABC]","Edubridge"));
		System.out.println(Pattern.matches("[ABC]","A"));
		System.out.println(Pattern.matches("[ABC]","B"));
		System.out.println(Pattern.matches("[ABC]","C"));
		
	}

}
