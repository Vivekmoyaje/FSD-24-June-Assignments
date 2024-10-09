package Exception_Handling_Tasks;

class CustomCheckedException extends Exception {

	private int errorCode;

	public CustomCheckedException(String message, int errorCode) {

		super(message);
		this.errorCode = errorCode;

	}

	public int geterrorCode() {
		return errorCode;
	}

}

public class CustomCheckedExceptionWithParameter {

	public static void main(String[] args) {

		try {
			throw new CustomCheckedException("Custom Checked Exception With Code",404);
		} catch (CustomCheckedException e) {

			System.err.println("CustomCheckedException caught : " + e.getMessage());
			System.err.println("Error code : " + e.geterrorCode());
		}

	}

}
