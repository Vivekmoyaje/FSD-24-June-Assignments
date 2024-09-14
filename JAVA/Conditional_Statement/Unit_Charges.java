package Conditional_Statement;

import java.util.Scanner;

/*
 * Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:

For first 50 units Rs. 0.50/unit
For next 150 units Rs. 0.75/unit
For next 250 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill
 * */

public class Unit_Charges {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter The Electricity Unit : ");
		int unit = input.nextInt();

		float amount, surcharge, billAmt;

		if (unit <= 50) {
			amount = unit * 0.50f;
		} 
		else if (unit <= 150) {
			amount = unit * 0.75f;
		}
		else if (unit <= 250) {
			amount = unit * 1.20f;
		} 
		else {
			amount = unit * 1.50f;
		}

		surcharge = amount * 0.2f;
		billAmt = amount + surcharge;
		System.out.println("Total Electricity Bill : " + billAmt);
	}
}

//Output:

//Enter The Electricity Unit : 
//200
//Total Electricity Bill : 288.00003

