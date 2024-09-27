package String_Tasks;

//Write a program to Given string Convert Uppercase to Lowercase

public class String_LowerCase39 {

	public static void convert_Lowercase(StringBuffer str) {

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {

				str.replace(i, i + 1, Character.toLowerCase(ch) + "");
			}
		}

	}

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("Welcome To India");

		System.out.println("The given string is : " + str);

		convert_Lowercase(str);
		System.out.println("Convert lowercase is : " + str);

	}

}

//Output:

//The given string is : Welcome To India
//Convert lowercase is : welcome to india
