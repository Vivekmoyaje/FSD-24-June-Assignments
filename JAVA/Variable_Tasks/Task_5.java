package Variable_Tasks;

import java.util.Scanner;

/*Exercise 5: Calculate the area of a rectangle.
Write a Java program that calculates the area of a rectangle using the formula area = length * width. 
Declare two double variables for length and width, and calculate the area.*/

public class Task_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length of rectangle :");
		double length = sc.nextDouble();

		System.out.println("Enter width of rectangle :");
		double width = sc.nextDouble();

		double area = length * width;

		System.out.println("The area of rectangle is : " + area);

	}
}
