package JAVA_Test;

public class Que20 {

	public static void main(String[] args) {

		String str = "Hello";

		String newStr = "";

		for (int i = 0; i < str.length(); i++) {

			newStr += str.substring(i, i + 1) + str.substring(i, i + 1);
		}

		System.out.println("Original string is : " + str);
		System.out.println("Repeating character string is : " + newStr);
	}

}

//Output:

//Original string is : Hello
//Repeating character string is : HHeelllloo
