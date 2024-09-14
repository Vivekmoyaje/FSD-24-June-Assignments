package Looping_Statements;

import java.util.Scanner;

//Write a program to find sum of all even numbers between 1 to n

public class Sum_Even_Number {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the last number : ");
		int num = input.nextInt();
		int sum = 0;

		for (int i = 0; i <= num; i += 2) {
			sum += i;
		}
		System.out.println("Sum of all even number is: " + sum);

	}
}

//Output:

//Enter the last number : 
//50
//Sum of all even number is: 650
