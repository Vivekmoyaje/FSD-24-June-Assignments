package String_Tasks;

//Write a program to Swap Two Strings without Third String Variable

public class Swap_WithoutThird28 {

	public static void main(String[] args) {

		String str1 = "Good";
		String str2 = "Morning";

		System.out.println("String 1 before swaping : " + str1);
		System.out.println("String 2 before swaping : " + str2 + "\n");

		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("String 1 after swaping : " + str1);
		System.out.println("String 2 after swaping : " + str2);

	}

}

//Output:

//String 1 before swaping : Good
//String 2 before swaping : Morning
//
//String 1 after swaping : Morning
//String 2 after swaping : Good
