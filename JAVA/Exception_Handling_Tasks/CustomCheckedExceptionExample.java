package Exception_Handling_Tasks;


class CustomCheckedException extends Exception {

	public CustomCheckedException(String message) {
		super(message);
	}

}

public class CustomCheckedExceptionExample {


	public static void main(String[] args) {

		try {
			throw new CustomCheckedException("This is a Custom Checked Exception.");
		} catch (CustomCheckedException e) {
			System.err.println("CustomCheckedException caught : " + e.getMessage());
		}

	}

}
