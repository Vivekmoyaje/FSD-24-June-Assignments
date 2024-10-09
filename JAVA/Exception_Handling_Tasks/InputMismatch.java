package Exception_Handling_Tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

//Exercise 6: Input Mismatch Exception

//Write a Java program that reads an integer from the user but handles the "InputMismatchException" if the input is not a valid integer.

public class InputMismatch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter the number : ");
			int number = input.nextInt();
			System.out.println("The number you are entered is : " + number);
		}

		catch (InputMismatchException e) {

			System.err.println("Exception caught : " + e.getMessage());
			System.err.println("Invalid input, plase enter an integer");
		}
	}

}
