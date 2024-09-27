package String_Tasks;

//Write a program to Count Number of Uppercase and Lowercase letters

public class Count_Case40 {

	public static void countCase(StringBuffer str) {

		int lower = 0;
		int upper = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isLowerCase(ch)) {

				lower += 1;
			}

			else if (Character.isUpperCase(ch)) {

				upper += 1;
			}
		}

		System.out.println("Total number lowercase character is : " + lower);
		System.out.println("Total number uppercase character is : " + upper);
	}

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("Welcome To India");

		System.out.println("Original string is : " + str + "\n");

		countCase(str);

	}

}
