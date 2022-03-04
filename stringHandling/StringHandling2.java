package stringHandling;
public class StringHandling2 {
	static String str=" ";//null
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(str.length());
		System.out.println(str.isBlank());//does not count space as a character input
		System.out.println(str.isEmpty());//counts space as a character input
		//isEmpty method internally executes length method
		System.out.println(str.charAt(0));
		String str1="Jack and Jue";
		System.out.println(str1.replace("J", "Bl"));
		
		System.out.println(str1.replaceFirst("J", "Bl"));
		System.out.println(str1);
		//str1=str1.replace("J", "Bl");
		System.out.println(str1.substring(2,5));//beginindex,endindex-1
		//2-4 : 
		String str2[]=str1.split(" ");
		System.out.println("using enhanced-for loop");
		for(String s:str2)
		{
			System.out.println(s);	
		}
		System.out.println("using for loop");
		for(int i=0;i<str2.length;i++)
		{
			System.out.println(str2[i]);
		}
		System.out.println(str2.length);
		char ch[]=str1.toCharArray();
		System.out.println("using enhanced-for loop");
		for(char c:ch)
		{
			System.out.print(c+",");	
		}
		System.out.println(str1.toLowerCase());
		//
		System.out.println(str1.toUpperCase());
		String str3="Hello User Welcome to Java Programming";
		System.out.println(str3.lastIndexOf("a"));//32
		System.out.println(str3.lastIndexOf("a",29));//25
		System.out.println(str3.indexOf("a"));//23
		System.out.println(str3.indexOf("a",30));//32
		
		//question
		//replace only the second occurrence of J with Bl 
		
		
	}

}
