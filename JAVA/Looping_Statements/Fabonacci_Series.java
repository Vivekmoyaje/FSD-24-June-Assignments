package Looping_Statements;

import java.util.Scanner;

// write a java prgram to print fibonacci series.

public class Fabonacci_Series {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number : ");

		int n = input.nextInt();

		int[] num = new int[n];

		num[0] = 0;
		num[1] = 1;

		for (int i = 2; i < n; i++) {
			num[i] = num[i - 1] + num[i - 2];
		}

		System.out.println("Fibonacci Series : ");

		for (int i = 0; i < n; i++) {
			System.out.println(num[i] + " ");
		}
	}
}

// Output : 

//Enter the number : 
//9
//Fibonacci Series : 
//0 
//1 
//1 
//2 
//3 
//5 
//8 
//13 
//21 
