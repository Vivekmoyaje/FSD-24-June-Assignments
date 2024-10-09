package Exception_Handling_Tasks;

class CustomUncheckedException extends Exception {

	public CustomUncheckedException(String message) {
		super(message);
	}

}

public class CustomUncheckedExceptionExample {

	public static void main(String[] args) {

		try {
			throw new CustomUncheckedException("This is a Custom Unchecked Exception");
		} catch (CustomUncheckedException e) {
			System.out.println("CustomUncheckedException caught : " + e.getMessage());
		}

	}

}
