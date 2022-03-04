package stringHandling;

public class StringHandling4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//StringBuffer and StringBuilder
		//mutable means modifiable
		//StringBuffer is thread-safe or synchronized
		//whereas StringBuilder is not thread-safe or non-synchronized
		//StringBuffer will be time-consuming whereas StringBuilder is not time-consuming.
		//taking printout 
		//System 1 --->printout---------
		//System 2 --->printout---------        PRINTER
		//System 3 --->printout---------
		
		//System 2
		//System 1
		//System 3
		//Synchronization : accessing the resource in a sequence
		//stringbuffer sb1 sb2
		//length,replace
		//
		
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());//default size or default number of characters
		sb.append("Hello");
		System.out.println(sb);
		sb.append("Welcome To Java Programming");
		System.out.println(sb);
		System.out.println(sb.capacity());
		//size of the object is automatically increased
		//newcapacity=(oldcapacity*2)+2;
		sb.append(" String Handling samples based upon StringBuffer and StringBuilder");
		System.out.println(sb.capacity());
		sb.ensureCapacity(500);
		//sb.append("hjhfj frjefhkj jdhfkj kjrfrj frjfh rfjrfh rfhjrf rjfhjrfhrjfhjrhf fjhrhfjr fr frjfh");
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());//139
		System.out.println(sb.length());
		System.out.println(sb.indexOf("e"));
		System.out.println(sb.indexOf("e",15));
		System.out.println(sb.lastIndexOf("e"));
		System.out.println(sb.lastIndexOf("e",15));
		System.out.println(sb.isEmpty());
		System.out.println(sb.substring(5, 15));//5 14
		System.out.println(sb);
		System.out.println(sb.delete(4, 8));
		System.out.println(sb);
		System.out.println(sb.deleteCharAt(19));
		System.out.println(sb);
		sb.insert(57, "Hello");	
		System.out.println(sb);
		System.out.println(sb.replace(23, 45, "REPLACED"));
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb);
	
	
	
	//regex
	//junit and maven
	
	
	
	
	
	
	
	
	
	
	
	}

}
