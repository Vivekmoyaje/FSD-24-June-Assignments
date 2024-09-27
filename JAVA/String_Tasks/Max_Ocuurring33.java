package String_Tasks;

//Write a program to find the maximum occurring character in a string

public class Max_Ocuurring33 {

	static char maxOccurring_Char(String str) {

		int arr[] = new int[100];

		int length = str.length();

		for (int i = 0; i < length; i++) {

			arr[str.charAt(i)]++;
		}

		int max = -1;
		char ch = ' ';

		for (int i = 0; i < length; i++) {

			if (max < arr[str.charAt(i)]) {

				max = arr[str.charAt(i)];
				ch = str.charAt(i);
			}
		}

		return ch;
	}

	public static void main(String[] args) {

		String str = "java exercises";

		System.out.println("Given String is: " + str);

		System.out.println("Max Occurring Character in String is: " + maxOccurring_Char(str));
	}

}
