package String_Tasks;

//Write a program to concatenate Two strings.

public class Concat_String1 {

	public String concatString(String str1, String str2) {

		if (str1.length() == str2.length() && str1.length() - 1 == str2.charAt(0)) {

			return str1 + str2;
		}

		else {

			return str1 + str2;
		}

	}

	public static void main(String[] args) {

		String str1 = "Good";
		String str2 = "Morning";

		Concat_String1 CS = new Concat_String1();

		System.out.println("String 1 is : " + str1);
		System.out.println("String 2 is : " + str2);
		System.out.println("The concatenate String is : " + CS.concatString(str1, str2));

	}

}

//Output:

//String 1 is : Good
//String 2 is : Morning
//The concatenate String is : GoodMorning
