package Variable_Tasks;

import java.util.Scanner;

/* Exercise 1: Calculate the area of a circle.
    Write a Java program that calculates the area of a
    circle using the formula area = π * radius * radius.
    Define the radius as a double variable and assume π is 3.14159  */

public class Task_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter The of circle : ");
		double radius = sc.nextDouble();

		float pi = 3.14159f;
		double area = pi * radius * radius;

		System.out.println("The area of circle is : " + area);

	}

}
