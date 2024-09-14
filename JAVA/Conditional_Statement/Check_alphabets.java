package Conditional_Statement;

import java.util.Scanner;

//Write a program to check whether a character is alphabet or not

public class Check_alphabets {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the character : ");
		char ch = input.next().charAt(0);
		
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
			System.out.println("This is a character");
		}
		else {
			System.out.println("This is a character");
		}
	}
}

//Output:

//Enter the character : 
//a
//This is a character
