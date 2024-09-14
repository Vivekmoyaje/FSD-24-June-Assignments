package Looping_Statements;

import java.util.Scanner;

// write a program to find factorial of any value.

public class Factorial {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any number : ");
		
		int num = input.nextInt();
		
		int n = 1;
		
		for(int i=1;i<=num;i++) {
			
			n = n*i;
		}
		
		System.out.println( "The factorial of " +num + " is " +n + " ");
	}

}


// Output : 

//Enter any number : 
//5
//The factorial of 5 is 120 
