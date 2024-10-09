package Exception_Handling_Tasks;

//Exercise 6: Custom Unchecked Exception with Parameters

//Write a Java program that defines a custom unchecked exception class called CustomUncheckedException
//with parameters and throws it within the program.

class CustomUncheckedException extends Exception {

	private String errorDetails;

	public CustomUncheckedException(String message, String errorDetails) {
		super(message);
		this.errorDetails = errorDetails;
	}

	public String geterrorDetails() {
		return errorDetails;
	}
}

public class CustomUncheckedExceptionWithParameter {

	public static void main(String[] args) {

		try {
			throw new CustomUncheckedException("Custom Unchecked Exception", "Additional details : ABC");
		} catch (CustomUncheckedException e) {
			System.err.println("CustomUncheckedException Caught : " + e.getMessage());
			System.err.println("Error Details : " + e.geterrorDetails());
		}

	}

}
