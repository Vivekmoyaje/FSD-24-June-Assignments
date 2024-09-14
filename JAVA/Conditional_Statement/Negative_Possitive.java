package Conditional_Statement;

import java.util.Scanner;

//Write a program to check whether a number is negative, positive or zero

public class Negative_Possitive {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int num = input.nextInt();

		if (num > 0) {
			System.out.println("The number is possitive");
		} else if (num < 0) {
			System.out.println("The number is negative");
		} else {
			System.out.println("The number is Zero");
		}

	}

}

//Output:

//Enter the number : 
//-7
//The number is negative
