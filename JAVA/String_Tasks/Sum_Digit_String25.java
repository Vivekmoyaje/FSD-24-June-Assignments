package String_Tasks;

//calculate the sum of digit in a given string.

public class Sum_Digit_String25 {

	public static void main(String[] args) {

		String str = "a6b8c9ng3g6";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {

				String num = str.substring(i, i + 1);
				sum += Integer.parseInt(num);

			}
		}

		System.out.println("The given string is : " + str);
		System.out.println("The sum of all digit in given string is : " + sum);
	}

}

//Output:

//The given string is : a6b8c9ng3g6
//The sum of all digit in given string is : 32
