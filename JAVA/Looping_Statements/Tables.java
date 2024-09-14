package Looping_Statements;

import java.util.Scanner;

//Write a program to print tables

public class Tables {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the starting number : ");
		int sNum = input.nextInt();

		System.out.println("Enter the End number : ");
		int eNum = input.nextInt();

		System.out.println("enter the table number : ");
		int table = input.nextInt();

		while (sNum <= eNum) {
			System.out.println(sNum + "*" + table + "=" + (sNum * table));
			sNum++;

		}
	}
}

//Output: 

//Enter the starting number : 
//1
//Enter the End number : 
//10
//enter the table number : 
//5
//1*5=5
//2*5=10
//3*5=15
//4*5=20
//5*5=25
//6*5=30
//7*5=35
//8*5=40
//9*5=45
//10*5=50

