package Conditional_Statement;

import java.util.Scanner;

//Write a program to input all sides of a triangle and check whether triangle is valid or not/

public class All_sides_Triangle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("enter the three sides of triangle : ");
		System.out.print("side1:");
		int side1 = input.nextInt();
		System.out.print("side2:");
		int side2 = input.nextInt();
		System.out.print("side3:");
		int side3 = input.nextInt();

		if ((side1 + side2) > side3) {

			if ((side1 + side3) > side2) {

				if ((side2 + side3) > side1) {
					System.out.println("triangle is valid ");
				} 
				else {
					System.out.println("Triangle is not valid ");
				}
			} 
			else {
				System.out.println("Triangle is not valid");
			}
		} 
		else {
			System.out.println("Triangle is not valid");
		}
	}

}

// Output:

//enter the three sides of triangle : 
//side1:45
//side2:75
//side3:45
//triangle is valid 


