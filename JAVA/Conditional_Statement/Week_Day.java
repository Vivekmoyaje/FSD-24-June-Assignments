package Conditional_Statement;

import java.util.Scanner;

//Write a program to input week number and print week day

public class Week_Day {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of day (1-7) :");
		int day = input.nextInt();
		
		switch(day) {
		
		case 1:
			System.out.println("This is Sunday");
			break;
			
		case 2:
			System.out.println("This is Monday");
			break;
			
		case 3:
			System.out.println("This is Sunday");
			break;
			
		case 4:
			System.out.println("This is Tuesday");
			break;
			
		case 5:
			System.out.println("This is Thursday");
			break;
			
		case 6:
			System.out.println("This is Friday");
			break;
			
		case 7:
			System.out.println("This is Saturday");
			break;
			
		default:
			System.out.println("Enter 1 to 7 ");
		}
	}

}

//Output:

//Enter the number of day (1-7) :
//5
//This is Thursday
