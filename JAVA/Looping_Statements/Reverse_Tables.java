package Looping_Statements;

import java.util.Scanner;

//Write a program to print reverse tables

public class Reverse_Tables {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the starting number : ");
		int sNum = input.nextInt();

		System.out.println("Enter the ending number : ");
		int eNum = input.nextInt();

		System.out.println("Enter the Table number : ");
		int table = input.nextInt();

		while (sNum >= eNum) {
			System.out.println(sNum + "*" + table + "=" + (sNum * table));
			sNum--;
		}
	}

}

// Output : 

//Enter the starting number : 
//10
//Enter the ending number : 
//1
//Enter the Table number : 
//5
//10*5=50
//9*5=45
//8*5=40
//7*5=35
//6*5=30
//5*5=25
//4*5=20
//3*5=15
//2*5=10
//1*5=5
