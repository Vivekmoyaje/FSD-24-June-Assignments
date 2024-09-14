package Conditional_Statement;

import java.util.Scanner;

//Write a program to find maximum between two numbers

public class Max_Number {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number : ");
		int num1 = input.nextInt();

		System.out.println("Enter the second number : ");
		int num2 = input.nextInt();

		if (num1 > num2) {
			System.out.println("The maximum number is : " + num1);
		} else if (num2 > num1) {
			System.out.println("The maximum number is : " + num2);
		} else {

			System.out.println("Both number are equal");
		}
	}

}

//Output:

//Enter the first number : 
//67
//Enter the second number : 
//89
//The maximum number is : 89
