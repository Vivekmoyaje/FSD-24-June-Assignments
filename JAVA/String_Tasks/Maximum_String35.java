package String_Tasks;

import java.util.Scanner;

//Write a program to find maximum between two string

public class Maximum_String35 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter string 1 : ");
		String str1 = input.nextLine();

		System.out.print("Enter string 2 : ");
		String str2 = input.nextLine();

		if (str1.length() > str2.length()) {

			System.out.println("maximum string is : " + str1);
		}

		else if (str1.length() < str2.length()) {

			System.out.println("maximum string is : " + str2);
		}

		else {

			System.out.println(" Both are equal strings ");
		}

	}

}

//Output:

//Enter string 1 : java
//Enter string 2 : python
//maximum string is : python
