package Conditional_Statement;

import java.util.Scanner;

//Write a program to check whether a number is even or odd

public class Even_OR_Odd {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = input.nextInt();
		
		if(num%2==0) {
			System.out.println("The number is Even");
		}
		else {
			System.out.println("The number is Odd");
		}
	}
}

//Output: 

//Enter the number : 
//34
//The number is Even