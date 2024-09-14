package Looping_Statements;

import java.util.Scanner;

// write a program to check whether the given number is prime or not.

public class Prime_Number {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int num = input.nextInt();

		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}

		if (count == 0) {
			System.out.println("This is a prime number");
		} else {
			System.out.println("this is not a prime number");
		}
	}
}

//Output : 

//Enter the number : 
//21
//this is not a prime number
