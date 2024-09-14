package Conditional_Statement;

import java.util.Scanner;

//Write a program to check whether a number is divisible by 5 and 11 or not

public class Divisible_Number {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int num = input.nextInt();

		if (num % 5 == 0 && num % 11 == 0) {
			System.out.println("The number is divisible by 5 and 11 both");
		} else {
			System.out.println("The number is not divisible by 5 and 11");
		}
	}

}

//Output:

//Enter the number : 
//55
//The number is divisible by 5 and 11 both
