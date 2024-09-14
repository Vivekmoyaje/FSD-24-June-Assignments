package Conditional_Statement;

import java.util.Scanner;

/*
* while purchasing certain items, a discount of 10% is offered if the 
* quantity 
* purchased is more than 100. If quantity and price per item are 
* input through 
* the keyboard, write a program to calculate the total expenses
* */

public class Total_Expenses {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Quantity Purchased : ");
		int quantity = input.nextInt();

		System.out.println("Enter the Amount Per Item : ");
		float amount = input.nextFloat();

		float exp;

		if (quantity > 100) {
			exp = quantity * amount;
			exp = exp - (exp * 0.1f);
		} else {
			exp = quantity * amount;
		}
		System.out.println("Total Expenses is : " + exp);
	}

}

// Output:

//Enter the Quantity Purchased : 
//5
//Enter the Amount Per Item : 
//100
//Total Expenses is : 500.0
