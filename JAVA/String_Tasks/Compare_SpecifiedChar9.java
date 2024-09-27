package String_Tasks;

//Write a program to compare a given string to the specified character sequence

public class Compare_SpecifiedChar9 {

	public static void main(String[] args) {

		String str = "Hello World";
		String str1 = "Good Morning";
	    CharSequence ch = "Hello java";

		System.out.println(str + " is equal to " + ch + " : " + str.contentEquals(ch));
		System.out.println(str1 + " is equal to " + ch + " : " + str1.contentEquals(ch));
	}

}

//Output:

//Hello World is equal to Hello World : false
//Good Morning is equal to Hello World : false
