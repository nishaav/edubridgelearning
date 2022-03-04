package stringHandling;

public class StringHandling3 {

	public static void main(String[] args) {
		//replace only the second occurrence of a string with another string 
		String str="Jack and Jue and Jill";
		System.out.println(str);
		str=replaceSecond(str,"and","or");
		System.out.println(str);
	}

	public static String replaceSecond(String str,String remove,String removeWith)
	{
		int index=str.indexOf(remove);
		String subStr=str.substring(index+1);
		String first=str.substring(0,index+1);
		str=first.concat(subStr.replaceFirst(remove, removeWith));
		return str;
	}
}
