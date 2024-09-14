package Looping_Statements;

import java.util.Scanner;

// write program to print all even number between 0 to given by user.

public class Even_Number {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" Enter the number : ");

		int num = input.nextInt();

		for (int i = 0; i <= num; i += 2) {
			System.out.println("The even number is: " + i);
		}
	}
}

// Output : 

//Enter the number : 
//100
//The even number is: 0
//The even number is: 2
//The even number is: 4
//The even number is: 6
//The even number is: 8
//The even number is: 10
//The even number is: 12
//The even number is: 14
//The even number is: 16
//The even number is: 18
//The even number is: 20
//The even number is: 22
//The even number is: 24
//The even number is: 26
//The even number is: 28
//The even number is: 30
//The even number is: 32
//The even number is: 34
//The even number is: 36
//The even number is: 38
//The even number is: 40
//The even number is: 42
//The even number is: 44
//The even number is: 46
//The even number is: 48
//The even number is: 50
//The even number is: 52
//The even number is: 54
//The even number is: 56
//The even number is: 58
//The even number is: 60
//The even number is: 62
//The even number is: 64
//The even number is: 66
//The even number is: 68
//The even number is: 70
//The even number is: 72
//The even number is: 74
//The even number is: 76
//The even number is: 78
//The even number is: 80
//The even number is: 82
//The even number is: 84
//The even number is: 86
//The even number is: 88
//The even number is: 90
//The even number is: 92
//The even number is: 94
//The even number is: 96
//The even number is: 98
//The even number is: 100
