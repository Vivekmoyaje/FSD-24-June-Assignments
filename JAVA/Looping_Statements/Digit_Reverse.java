package Looping_Statements;

import java.util.Scanner;

// write a program to reverse the all digit.

public class Digit_Reverse {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the digits: ");

		long num = input.nextLong();
		long GivenDigit = num;
		long reverse = 0;
		long rem = 0;

		while (num > 0) {
			rem = num % 10; // Calculate remainder
			reverse = reverse * 10 + rem;
			num /= 10; // Remove last digit
		}

		System.out.println("The Given Digit is: " + GivenDigit);
		System.out.println("The Reverse Digit is: " + reverse);
	}
}


//output :

//Enter the digits: 
//123456
//The Given Digit is: 123456
//The Reverse Digit is: 654321
