package Variable_Tasks;

import java.util.Scanner;

/*Exercise 7: Perform arithmetic operations.
Write a Java program that performs various arithmetic operations
 (addition, subtraction, multiplication, division) on two numbers. 
 Declare two int variables and perform these operations.*/

public class Task_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number :");
		int num1 = sc.nextInt();

		System.out.println("Enter second number :");
		int num2 = sc.nextInt();

		int add = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;

		System.out.println("Addition : " + add + "\n" + "Subtraction : " + sub + "\n" 
		                      + "Multiplication : " + mul + "\n" + "Divition : " + div);

	}
}
