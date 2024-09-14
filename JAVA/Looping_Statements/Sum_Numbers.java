package Looping_Statements;

import java.util.Scanner;

//Write a program to find sum of all natural numbers between 1 to n

public class Sum_Numbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the last number : ");
		int num = input.nextInt();

		int sum = 0;

		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		System.out.println("Sum of all numbers is : " + sum);

	}

}

//Output:

//Enter the last number : 
//10
//Sum of all numbers is : 55
