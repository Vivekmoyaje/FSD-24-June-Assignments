package Exception_Handling_Tasks;

//Write a Java program that defines a custom exception class and throws that exception within the program.

class CustomException extends Exception {

	public CustomException(String msg) {
		super(msg);
	}
}

public class CustomExceptionHandling {

	public static void main(String[] args) {

		try {
			throw new CustomException("This is a custom exception");
		}
		catch (CustomException e) {

			System.err.println("Exception caught : " + e.getMessage());
		}

	}

}
