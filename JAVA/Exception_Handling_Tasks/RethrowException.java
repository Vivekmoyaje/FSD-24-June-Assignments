package Exception_Handling_Tasks;

//Exercise 10: Rethrowing Exceptions

//Write a Java program that catches an exception, performs some custom logic, and then rethrows
//the exception to be handled by the caller.

public class RethrowException {

	public static void devideByZero() {

		int numerator = 5;
		int denomenator = 0;

		try {
			int result = numerator / denomenator;
			System.out.println("Result is : " + result);
		} catch (ArithmeticException e) {
			System.err.println("Arithmetic Exception caught : " + e.getMessage());
			throw e;
		}
	}

	public static void main(String[] args) {

		try {
			devideByZero();
		} catch (ArithmeticException e) {
			System.err.println("Exception caught at heigher level : " + e.getMessage());
		}

	}

}
