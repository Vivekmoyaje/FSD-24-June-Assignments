package Looping_Statements;

import java.util.Scanner;

//Write a program to find sum of all odd numbers between 1 to n

public class Sum_Odd_Numbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the last number : ");
		int num = input.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i += 2) {
			sum += i;
		}
		System.out.println("Sum of all Odd number is: " + sum);

	}

}

//Output:
//	
//	Enter the last number : 
//	10
//	Sum of all Odd number is: 25
