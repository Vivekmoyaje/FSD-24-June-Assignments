package Looping_Statements;

import java.util.Scanner;

// write a program to print all odd number between 1 to n.

public class Odd_Numbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the last number : ");
		int num = input.nextInt();

		for (int i = 1; i <= num; i += 2) {
			System.out.println(i);
		}
	}
}

// Output : 

//Enter the last number : 
//50
//1
//3
//5
//7
//9
//11
//13
//15
//17
//19
//21
//23
//25
//27
//29
//31
//33
//35
//37
//39
//41
//43
//45
//47
//49
