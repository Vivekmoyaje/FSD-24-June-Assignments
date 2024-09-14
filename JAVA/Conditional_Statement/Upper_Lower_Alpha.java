package Conditional_Statement;

import java.util.Scanner;

//Write a program to check whether a character is uppercase or lowercase alphabet

public class Upper_Lower_Alpha {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Character :");
		char ch = input.next().charAt(0);
		
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("This is a Uppercase Alphabet");
		} else {
			System.out.println("This is a Lowercase Alphabet");
		}
	}

}

//Output:

//Enter the Character :
//A
//This is a Uppercase Alphabet
