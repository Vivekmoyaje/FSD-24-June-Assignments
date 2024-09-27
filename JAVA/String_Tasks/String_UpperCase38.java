package String_Tasks;

//Write a program to Given string Convert Lowercase to Uppercase

public class String_UpperCase38 {

	public static void convert_Uppercase(StringBuffer str) {

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isLowerCase(ch)) {

				str.replace(i, i + 1, Character.toUpperCase(ch) + "");
			}
		}

	}

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("Welcome to india");

		System.out.println("The given string is : " + str);

		convert_Uppercase(str);
		System.out.println("Convert uppercase is : " + str);

	}

}

//Output:

//The given string is : Welcome to india
//Convert uppercase is : WELCOME TO INDIA
