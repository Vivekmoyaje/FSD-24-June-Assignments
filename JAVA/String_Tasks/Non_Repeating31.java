package String_Tasks;

//Write a program to find first non repeating character in a string

public class Non_Repeating31 {

	public static void main(String[] args) {

		String str = "Welcome to india";

		System.out.println("The given string is : " + str);

		System.out.println("Non repeating character in string is : ");

		boolean temp = false;

		for (int i = 0; i < str.length(); i++) {

			temp = true;

			for (int j = 0; j < str.length(); j++) {

				if (i != j && str.charAt(i) == str.charAt(j)) {

					temp = false;
					break;
				}
			}

			if (temp) {

				System.out.println(str.charAt(i));
			}
		}
	}

}

//Output:

//The given string is : Welcome to india
//Non repeating character in string is : 
//W
//l
//c
//m
//t
//n
//d
//a
