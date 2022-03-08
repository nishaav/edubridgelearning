package stringHandling;
import java.util.StringTokenizer;

public class StringHandling12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//split method in java
		String str="Hii I am @trying to work@with @String Handling";
		String arr[]=str.split(" @ ");//exact match with the delimiter/regex
		for(String s:arr)
		{
			System.out.println(s);
		}
		System.out.println(arr.length);
		
		//StringTokenizer
		//it will split on the basis of all the possibilities of the delimiters
		// @ 
		//tokens: splitted strings
		StringTokenizer st=new StringTokenizer(str, " @ ");
		System.out.println("Length : "+st.countTokens());
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		System.out.println("Length : "+st.countTokens());
		
	}

}
