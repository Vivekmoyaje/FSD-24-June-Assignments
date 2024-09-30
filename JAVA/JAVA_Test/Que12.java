package JAVA_Test;

//12.Write a program to check whether a given string ends with the contents of 
//another string

public class Que12 {

	public static void main(String[] args) {

		String str = "Welcome to java";

		String str1 = "java";

		System.out.println(str + " End with " + str1 + " : " + str.endsWith(str1));

	}

}

//Output:

//Welcome to java End with java : true
