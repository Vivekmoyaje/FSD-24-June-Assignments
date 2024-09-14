package Conditional_Statement;

import java.util.Scanner;

//Write a program to find maximum between three numbers

public class Three_Maximum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Number 1 : ");
		int num1 = input.nextInt();

		System.out.println("Enter the Number 2 : ");
		int num2 = input.nextInt();

		System.out.println("Enter the Number 3 : ");
		int num3 = input.nextInt();

		if (num1 > num2 && num1 > num3)
			System.out.println("Maximum Number is " + num1);
		else if (num1 < num2 && num3 < num2)
			System.out.println("Maximum Number is " + num2);
		else
			System.out.println("Maximum Number is " + num3);
	}

}

//Output:

//Enter the Number 1 : 
//45
//Enter the Number 2 : 
//38
//Enter the Number 3 : 
//97
//Maximum Number is 97
