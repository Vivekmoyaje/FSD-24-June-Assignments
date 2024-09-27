package String_Tasks;

//Write a program to check if the letter is present in the word

public class Check_Letter37 {

	public static void main(String[] args) {

		String str = "Java Developer";

		System.out.println("The given string is : " + str);

		boolean check = false;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'v') {

				check = true;
				break;
			}

		}

		System.out.println("The character v is present in the given string : " + check);
	}

}

//Output:

//The given string is : Java Developer
//The character v is present in the given string : true
