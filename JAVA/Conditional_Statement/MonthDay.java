package Conditional_Statement;

import java.util.Scanner;

//Write a program to input month number and print month Name

public class MonthDay {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the month number : ");
		int month_Num = input.nextInt();

		switch (month_Num) {

		case 1:
			System.out.println("This is January");
			break;

		case 2:
			System.out.println("This is February");
			break;

		case 3:
			System.out.println("This is March");
			break;

		case 4:
			System.out.println("This is April");
			break;

		case 5:
			System.out.println("This is May");
			break;
			
		case 6:
			System.out.println("This is June");
			break;

		case 7:
			System.out.println("This is July");
			break;

		case 8:
			System.out.println("This is August");
			break;

		case 9:
			System.out.println("This is September");
			break;

		case 10:
			System.out.println("This is October");
			break;

		case 11:
			System.out.println("This is November");
			break;

		case 12:
			System.out.println("This is December");
			break;

		default:
			System.out.println("Enter the number between 1 to 12 ");

		}
	}

}

//Output:

//Enter the month number : 
//6
//This is June