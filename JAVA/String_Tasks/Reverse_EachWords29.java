package String_Tasks;

//Write a program to Reverse Each Word of a String

public class Reverse_EachWords29 {

	public static void main(String[] args) {

		reverseWord("welcome to india");	

	}

	private static String reverseWord(String str) {

		String[] words = str.split(" ");
		String temp = "";

		for (String word : words) {

			temp += reverseWithConcatString(word) + " ";

		}

		display(str, temp);

		return temp;
	}

	private static final String reverseWithConcatString(String str1) {

		String revWord = "";

		for (int i = (str1.length() - 1); i >= 0; i--) {

			revWord += str1.charAt(i);
		}

		return revWord;
	}

	private static final void display(String str, String temp) {

		System.out.println(str);
		System.out.println(temp);
	}

}
