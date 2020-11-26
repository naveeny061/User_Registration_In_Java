package pattern;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface IValidateFunction {
	boolean validate(String x);
}

public class UserRegistration {

	IValidateFunction firstNameValidation = (x) -> {
		String expression = "^[A-Z][a-z]{2,}$";
		Pattern pattern = Pattern.compile(expression);
		boolean result = pattern.matcher(x).matches();
		if (result)
			return result;
		else
			try {
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID,
						"Invalid First Name");
			} catch (UserRegistrationException e) {
				e.printStackTrace();
			}
		return result;
	};
	IValidateFunction lastNameValidation = (x) -> {
		String expression = "^[A-Z][a-z]{2,}$";
		Pattern pattern = Pattern.compile(expression);
		boolean result = pattern.matcher(x).matches();
		if (result)
			return result;
		else
			try {
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID,
						"Invalid Last Name");
			} catch (UserRegistrationException e) {
				e.printStackTrace();
			}
		return result;
	};

	IValidateFunction emailValidation = (x) -> {
		String expression = "^[a-zA-Z][a-zA-Z0-9]*([.+-][a-zA-Z0-9]+)*(@[a-zA-Z0-9]+[.][a-zA-Z0-9]{2,})([.][a-zA-Z]{2,4})?$";
		Pattern pattern = Pattern.compile(expression);
		boolean result = pattern.matcher(x).matches();
		if (result)
			return result;
		else
			try {
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID, "Invalid Email");
			} catch (UserRegistrationException e) {
				e.printStackTrace();
			}
		return result;
	};

	IValidateFunction mobileValidation = (x) -> {
		String expression = "^[+]?[0-9]{2}[ ][0-9]{10}$";
		Pattern pattern = Pattern.compile(expression);
		boolean result = pattern.matcher(x).matches();
		if (result)
			return result;
		else
			try {
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID,
						"Invalid Mobile number");
			} catch (UserRegistrationException e) {
				e.printStackTrace();
			}
		return result;
	};

	IValidateFunction passwordValidation = (x) -> {
		String expression = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?!(?:.*[!@#$%^&*]){2})[a-zA-Z0-9!@#$%^&*]{8,}$";
		Pattern pattern = Pattern.compile(expression);
		boolean result = pattern.matcher(x).matches();
		if (result)
			return result;
		else
			try {
				throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID,
						"Invalid Password");
			} catch (UserRegistrationException e) {
				e.printStackTrace();
			}
		return result;
	};

	public static void main(String[] args) throws UserRegistrationException {

		UserRegistration user = new UserRegistration();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to User Registration System ");
		System.out.println("Enter First Name");
		String firstName = scanner.nextLine();
		user.firstNameValidation.validate(firstName);
		System.out.println("Enter Last Name");
		String lastName = scanner.nextLine();
		user.lastNameValidation.validate(lastName);
		System.out.println("Enter Email");
		String email = scanner.nextLine();
		user.emailValidation.validate(email);
		System.out.println("Enter Mobile Number");
		String mobile = scanner.nextLine();
		user.mobileValidation.validate(mobile);
		System.out.println("Enter Password");
		String password = scanner.nextLine();
		user.passwordValidation.validate(password);
	}
}
