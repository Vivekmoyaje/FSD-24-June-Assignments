package String_Tasks;

//Write a program to create a new string repeating every character twice of a given string

public class Repeating_Char24 {

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
