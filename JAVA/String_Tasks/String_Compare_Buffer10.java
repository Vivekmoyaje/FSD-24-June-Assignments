package String_Tasks;

//Write a program to compare a given string to the specified string buffer.

public class String_Compare_Buffer10 {
	
	public static void main(String[] args) {
		
		String str = "Hello World";
		String str1 = "Good Morning";
		
		StringBuffer buffer = new StringBuffer(str);
		
		System.out.println(str +" is equal to " +buffer +" : " +str.contentEquals(buffer));
		System.out.println(str1 +" is equal to " +buffer +" : " +str1.contentEquals(buffer));
	}

}

//Output:

//Hello World is equal to Hello World : true
//Good Morning is equal to Hello World : false