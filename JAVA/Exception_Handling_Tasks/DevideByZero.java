package Exception_Handling_Tasks;

//Exercise 1: Divide by Zero Exception
//Write a Java program that divides two numbers and handles the "ArithmeticException" that occurs when dividing by zero.

public class DevideByZero {

	public static void main(String[] args) {

		int n = 26;
		int d = 0;

		try {
			System.out.println("Result : " + n / d);
		}

		catch (ArithmeticException e) {

			System.err.println("Exception caught : " + e.getMessage());
			System.err.println("The number should not be zero");

		}
	}

}
