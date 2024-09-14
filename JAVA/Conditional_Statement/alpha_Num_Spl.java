package Conditional_Statement;

import java.util.Scanner;

//Write a program to input any character and check whether it is alphabet, digit or special character

public class alpha_Num_Spl {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the values : ");
		char val = input.next().charAt(0);
		
		if(val>='A' && val<='Z' || val>='a' && val<='z') {
			System.out.println("This is a Alphabet");
		}
		else if(val>='0' && val<='9') {
			System.out.println("this ia a Number");
		}
		else {
			System.out.println("This is a Special character");
		}
	}

}

//Output:

//Enter the values : 
//a
//This is a Alphabet
