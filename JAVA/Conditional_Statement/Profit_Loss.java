package Conditional_Statement;

import java.util.Scanner;

//Write a program to calculate profit or loss

public class Profit_Loss {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Buy Price : ");
		int Buy = input.nextInt();

		System.out.println("Enter the Selling price : ");
		int Sell = input.nextInt();

		int Loss, Profit;

		if (Buy > Sell) {
			Loss = Buy - Sell;
			System.out.println("Total loss is : " + Loss +" rs");
		}
		else if (Sell > Buy) {
			Profit = Sell - Buy;
			System.out.println("Total Profit is : " + Profit +" rs");
		}
		
		else {
			System.out.println("No profit No loss");
		}
	}

}

//Output:

//Enter the Buy Price : 
//500
//Enter the Selling price : 
//600
//Total Profit is : 100 rs

