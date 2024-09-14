package Variable_Tasks;

import java.util.Scanner;

/*Exercise 6: Calculate the total cost.
Write a Java program that calculates the total cost of an item based on its price and quantity. 
Declare a double variable for the price and an int variable for the quantity, then calculate and display the total cost.*/

public class Task_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the price of an item :");
		double price = sc.nextDouble();

		System.out.println("Enter the quantity of an item :");
		int quantity = sc.nextInt();

		double totalCost = price * quantity;

		System.out.println("Total cost of an item is : " + totalCost);
	}

}
