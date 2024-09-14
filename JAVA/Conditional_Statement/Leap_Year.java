package Conditional_Statement;

import java.util.Scanner;

//Write a program to check whether a year is leap year or not

public class Leap_Year {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the year : ");
		int year = input.nextInt();
		
		boolean leap = false;
		
		if(year%400==0) {
			leap=true;
		}
		else if(year%100==0) {
			leap=false;
		}
		else if(year%4==0) {
			leap=true;
		}
		
		if(leap) {
			System.out.println(year + " is a leap year");
		}
		
		else {
			System.out.println(year + " is not a leap year");
		}
	}

}

//Output:

//Enter the year : 
//2024
//2024 is a leap year
