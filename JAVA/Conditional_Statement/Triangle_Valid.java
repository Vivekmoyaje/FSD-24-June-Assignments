package Conditional_Statement;

import java.util.Scanner;

//Write a program to input angles of a triangle and check whether triangle is valid or not

public class Triangle_Valid {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Three Angles of Triangle :");
		System.out.print("Angle1:");
		int a1 = input.nextInt();
		System.out.print("Angle2:");
		int a2 = input.nextInt();
		System.out.print("Angle3:");
		int a3 = input.nextInt();
		
		int sum = a1 + a2 + a3;
		
		if (sum == 180 && a1 > 0 && a2 > 0 && a3 > 0) {
			System.out.println("Triangle is valid");
		} else {
			System.out.println("Triangle is not valid");
		}
	}
}

//Output:

//Enter Three Angles of Triangle :
//Angle1:65
//Angle2:65
//Angle3:50
//Triangle is valid
