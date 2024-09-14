package Looping_Statements;

import java.util.Scanner;

//write a program to sum of its Digits

public class Sum_Digits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Digits :");
		int num = input.nextInt();
		int n = num;
		int sum = 0;
		int rem = 0;

		while (num > 0) {
			rem = num % 10;
			sum = sum + rem;
			num /= 10;
		}
		System.out.println("Given Digits :" + n);
		System.out.println("Sum of Digits :" + sum);
	}
}

// Output : 

//Enter the Digits :
//12345
//Given Digits :12345
//Sum of Digits :15
