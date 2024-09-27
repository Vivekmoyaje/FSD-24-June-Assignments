package String_Tasks;

//Write a program to print after removing duplicates from a given string

public class Remove_Duplicate32 {

	private static void removeDuplicate(String rem) {

		char[] arr = rem.toCharArray();
		String str = "";

		for (char ele : arr) {

			if (str.indexOf(ele) == -1) {

				str += ele;
			}
		}

		System.out.println("String after removing duplicate character is : " + str);
	}

	public static void main(String[] args) {

		String str = "Java Developer";

		System.out.println("The given string is : " + str);

		removeDuplicate(str);
	}

}

//Output:

//The given string is : Java Developer
//String after removing duplicate character is : Jav Delopr
