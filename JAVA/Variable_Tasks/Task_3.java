package Variable_Tasks;

/*Exercise 3: Calculate the average of three floating-point numbers.
 Write a Java program that calculates the average of three floating-point numbers 
(e.g., 2.5, 3.0, 4.5). Declare three double variables and calculate their average.*/

public class Task_3 {
	
	public static void main(String[] args) {
		
		double num1 = 2.5;
		double num2 = 3.0;
		double num3 = 4.5;
		
		double average = (num1+num2+num3)/3;
		
		System.out.println("The average is: " + average);
	}

}
