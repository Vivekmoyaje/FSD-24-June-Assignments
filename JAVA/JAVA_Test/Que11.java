package JAVA_Test;

//11.Write a program to get the canonical representation of the string object

public class Que11 {
	
	public static void main(String[] args) {

		String str = "Hello World";
		String str1 = new StringBuffer("Hello").append(" World").toString();
		String str2 = str1.intern();

		System.out.println("str == str1 : " +(str==str1));
		System.out.println("str == str2 : " +(str==str2));
		
	
	}

}

//Output:

//str == str1 : false
//str == str2 : true