package Looping_Statements;

import java.util.Scanner;

// write a program to find the value of one number raised to the power of another.

public class Power {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the base value : ");
		int base = input.nextInt();

		System.out.println("Enter the power value : ");
		int power = input.nextInt();

		int result = 1;

		for (int i = 1; i <= power; i++) {
			result *= base;
		}

		System.out.println(result);

	}

}

// Output : 

//Enter the base value : 
//3
//Enter the power value : 
//3
//27
