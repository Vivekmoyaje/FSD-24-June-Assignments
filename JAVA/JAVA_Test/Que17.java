package JAVA_Test;

//17.Write a program to Count Number of Uppercase and Lowercase letters

public class Que17 {

	public static void main(String[] args) {

		String str = "Java Developer";

		int upper = 0;
		int lower = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				upper += 1;
			} else if (Character.isLowerCase(ch)) {
				lower += 1;
			}
		}

		System.out.println("The lower case character is : " + lower);
		System.out.println("The upper case character is : " + upper);
	}
}

//Output:

//The lower case character is : 11
//The upper case character is : 2