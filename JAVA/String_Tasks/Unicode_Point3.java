package String_Tasks;

//Write a program to get the character (Unicode code point) at the given index within the String

public class Unicode_Point3 {

	public static void main(String[] args) {

		String str = "Welcome to Hyderrabad";

		int a = str.codePointAt(4);
		int b = str.codePointAt(13);
		
		System.out.println("The given string is : " +str);

		System.out.println("Unicode point of " + str.charAt(4) + " is : " + a);
		System.out.println("Unicode point of " + str.charAt(13) + " is : " + b);
	}

}

//Output:

//The given string is : Welcome to Hyderrabad
//Unicode point of o is : 111
//Unicode point of d is : 100