package Exception_Handling_Tasks;

class InvalidInputException extends RuntimeException {
	
	public InvalidInputException(String message) {
		super(message);
	}
}

public class CustomUncheckedExceptionUsage {
	
	public static void main(String[] args) 
	{
		String username = "Vivek12345";
		if (username.length() < 6) {
			throw new InvalidInputException("Username must be at least 6 characters long.");
		}
		System.out.println("Username: " + username);
	}
}
