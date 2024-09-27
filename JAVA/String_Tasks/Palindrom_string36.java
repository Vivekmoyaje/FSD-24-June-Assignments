package String_Tasks;

//Write a program How to check Palindrome String

public class Palindrom_string36 {

	public static void palindrom(String str) {

		StringBuffer check = new StringBuffer(str);

		check.reverse();

		String reverse = check.toString();

		if (str.equals(reverse)) {

			System.out.println("The string \"" + str + "\" is palindrom");
		}

		else {

			System.out.println("The string \"" + str + "\" is not palindrom");
		}
	}

	public static void main(String[] args) {

		palindrom("hello");
		palindrom("madam");

	}

}

//Output:

//The string "hello" is not palindrom
//The string "madam" is palindrom
