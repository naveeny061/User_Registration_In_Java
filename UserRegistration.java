package pattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	Scanner scanner = new Scanner(System.in);

	public void validateFirstName() throws UserRegistrationException {
		System.out.println("Enter First Name");
		String firstName = scanner.nextLine();
		String expression = "^[A-Z][a-z]{2,}$";
		Pattern pattern = Pattern.compile(expression);
		boolean result = pattern.matcher(firstName).matches();
		if (result)
			System.out.println(result);
		else
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID, "Invalid First Name");
	}

	public void validateLastName() throws UserRegistrationException {
		System.out.println("Enter Last Name");
		String lastName = scanner.nextLine();
		String expression = "^[A-Z][a-z]{2,}$";
		Pattern pattern = Pattern.compile(expression);
		boolean result = pattern.matcher(lastName).matches();
		if (result)
			System.out.println(result);
		else
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID, "Invalid Last Name");
	}

	public boolean validateEmail() throws UserRegistrationException {
		System.out.println("Enter Email");
		String email = scanner.nextLine();
		String expression = "^[a-zA-Z][a-zA-Z0-9]*([.+-][a-zA-Z0-9]+)*(@[a-zA-Z0-9]+[.][a-zA-Z0-9]{2,})([.][a-zA-Z]{2,4})?$";
		Pattern pattern = Pattern.compile(expression);
		boolean result = pattern.matcher(email).matches();
		if (result) {
			System.out.println(result);
			return result;}
		else
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID, "Invalid Email");

	}

	public void validateMobile() throws UserRegistrationException {
		System.out.println("Enter Mobile Number");
		String mobile = scanner.nextLine();
		String expression = "^[+]?[0-9]{2}[ ][0-9]{10}$";
		Pattern pattern = Pattern.compile(expression);
		boolean result = pattern.matcher(mobile).matches();
		if (result)
			System.out.println(result);
		else
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID,
					"Invalid Mobile Number");
	}

	public void validatePassword() throws UserRegistrationException {
		System.out.println("Enter Password");
		String password = scanner.nextLine();
		String expression = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?!(?:.*[!@#$%^&*]){2})[a-zA-Z0-9!@#$%^&*]{8,}$";
		Pattern pattern = Pattern.compile(expression);
		boolean result = pattern.matcher(password).matches();
		if (result)
			System.out.println(result);
		else
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID, "Invalid Password");
	}

	public static void main(String[] args) throws UserRegistrationException {

		UserRegistration user = new UserRegistration();
		System.out.println("Welcome to User Registration System ");
		user.validateFirstName();
		user.validateLastName();
		user.validateEmail();
		user.validateMobile();
		user.validatePassword();

	}
}
