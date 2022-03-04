package stringHandling;

public class StringHandling1 {
static String str2;
	public static void main(String[] args) {
		// String Handling :
		//String class java.lang 
		//String 
		//StringBuilder and StringBuffer
		//Regex: regular expressions
		String str="Java";//string literal
		String str1="Java";
		//memory in String constant pool
		String obj=new String("Java");//object
		//memory in Heap Area
		String obj1=new String("JAVA");
		System.out.println(str==str1);
		System.out.println(obj==obj1);
		//== will compare the references (addresses) not the value
		//equals
		System.out.println(str==obj1);
		System.out.println(str.equals(obj1));//value as well as case sensitivity
		System.out.println(str.equalsIgnoreCase(obj1));
		//gmail account :
				//equalsIgnoreCase method : username
				//equals : password
		System.out.println("length of string : "+str.length());//number of characters including
		//each and every characters(special symbol/digit/alphabet/space
		System.out.println(str.concat(" Programming"));
		System.out.println(str);
		str=str.concat(" Programming");
		System.out.println(str);
		//String is immutable in java
		//unmodifiable or unchangeable
		//Java Programming
		System.out.println(str.contains("z"));
		System.out.println(str.contains("Program"));
		System.out.println(str.indexOf("a"));//1 works in forward direction starting from 0 to end
		System.out.println(str.indexOf("z"));
		System.out.println(str.lastIndexOf("a"));//works in backward direction starting from last character moving towards first
		System.out.println(str1.endsWith("a"));
		
		
	
	}

}
