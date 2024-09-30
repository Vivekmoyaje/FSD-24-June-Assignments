package JAVA_Test;

import java.util.Scanner;

//4. Write a program to search an element in an array

public class Que4 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the search element : ");
		int num = input.nextInt();

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == num) {

				System.out.println("The element found at index : " + i);
				System.out.println("The element found at possition : " + (i + 1));
			}
		}
	}

}

//Output:

//Enter the search element : 5
//The element found at index : 4
//The element found at possition : 5
