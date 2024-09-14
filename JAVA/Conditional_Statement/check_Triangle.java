package Conditional_Statement;

import java.util.Scanner;

//Write a program to check whether the triangle is equilateral, isosceles or scalene triangle

public class check_Triangle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Three Sides of Triangle :");
		System.out.print("side1:");
		int side1 = input.nextInt();
		System.out.print("side2:");
		int side2 = input.nextInt();
		System.out.print("side3:");
		int side3 = input.nextInt();

		if (side1 == side2 && side2 == side3) {
			System.out.println("Equilateral Triangle.");
		}

		else if (side1 == side2 || side1 == side3 || side2 == side3) {
			System.out.println("Isosceles Triangle.");
		} else {
			System.out.println("Scalene Triangle.");
		}
	}
}

// Output:

//Enter Three Sides of Triangle :
//side1:45
//side2:45
//side3:45
//Equilateral Triangle.