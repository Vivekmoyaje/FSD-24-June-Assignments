package Exception_Handling_Tasks;

//Exercise 7: Custom Checked Exception for User Authentication

//Write a Java program that defines a custom checked exception class called AuthenticationException
//to handle authentication errors (e.g., invalid username or password).

class AuthenticationException extends Exception {
	public AuthenticationException(String message) {
		super(message);
	}

}

class AuthenticationService {
	public void Authenticate(String Username, String Password) throws AuthenticationException {
		if (!isInvalidCredential(Username, Password)) {
			throw new AuthenticationException("Authentication failed ! Invalid username or password.");
		}
	}

	private boolean isInvalidCredential(String Username, String Password) {
		return true;
	}
}

public class CustomCheckedExceptionForAuthentication {

	public static void main(String[] args) {

		AuthenticationService AuthService = new AuthenticationService();

		try {
			AuthService.Authenticate("Vivek", "Vivek123");
			System.err.println("Authntication Succesfully.");
		} catch (AuthenticationException e) {
			System.err.println("AutheticationException Caught : " + e.getMessage());
		}

	}

}
