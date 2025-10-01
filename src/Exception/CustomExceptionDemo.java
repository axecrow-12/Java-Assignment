package Exception;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}

public class CustomExceptionDemo {
	public static void main(String[] args) {
		try {
			checkAge(19);
		}
		catch (InvalidAgeException e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}
	}


	
	static void checkAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("You must be 18 or older.");
		}
		else {
			System.out.println("Access granted");
		}
	}
}