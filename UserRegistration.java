package pattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean validateFirstName(String firstname) {
		String expression = "^[A-Z][a-z]{2,}$";
		Pattern pattern = Pattern.compile(expression);
		return pattern.matcher(firstname).matches();
	}

	public boolean validateLastName(String lastname) {
		String expression = "^[A-Z][a-z]{2,}$";
		Pattern pattern = Pattern.compile(expression);
		return pattern.matcher(lastname).matches();
	}

	public boolean validateEmail(String email) {
		String expression = "^[a-zA-Z][a-zA-Z0-9]*([.+-][a-zA-Z0-9]+)*(@[a-zA-Z0-9]+[.][a-zA-Z0-9]{2,})([.][a-zA-Z]{2,4})?$";
		Pattern pattern = Pattern.compile(expression);
		return pattern.matcher(email).matches();
	}

	public boolean validateMobile(String mobile) {
		String expression = "^[+]?[0-9]{2}[ ][0-9]{10}$";
		Pattern pattern = Pattern.compile(expression);
		return pattern.matcher(mobile).matches();
	}

	public boolean validatePassword(String password) {
		String expression = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?!(?:.*[!@#$%^&*]){2})[a-zA-Z0-9!@#$%^&*]{8,}$";
		Pattern pattern = Pattern.compile(expression);
		return pattern.matcher(password).matches();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserRegistration user = new UserRegistration();
		System.out.println("Welcome to User Registration System ");
		while (true) {
			System.out.println("Enter First Name");
			String firstName = scanner.nextLine();
			boolean check = user.validateFirstName(firstName);
			if (check) {
				System.out.println(user.validateFirstName(firstName));
				break;
			} else {
				System.out.println("Please enter valid first name ");
			}
		}

		while (true) {
			System.out.println("Enter Last Name");
			String lastName = scanner.nextLine();
			boolean check = user.validateFirstName(lastName);
			if (check) {
				System.out.println(user.validateFirstName(lastName));
				break;
			} else {
				System.out.println("Please enter valid last name");
			}
		}

		while (true) {
			System.out.println("Enter Email");
			String email = scanner.nextLine();
			boolean check = user.validateEmail(email);
			if (check) {
				System.out.println(user.validateEmail(email));
				break;
			} else {
				System.out.println("Please enter valid email address");
			}
		}

		while (true) {
			System.out.println("Enter Mobile Number");
			String mobile = scanner.nextLine();
			boolean check = user.validateMobile(mobile);
			if (check) {
				System.out.println(user.validateMobile(mobile));
				break;
			} else {
				System.out.println("Please enter valid mobile number");
			}
		}

		while (true) {
			System.out.println("Enter Password");
			String password = scanner.nextLine();
			boolean check = user.validatePassword(password);
			if (check) {
				System.out.println(user.validatePassword(password));
				break;
			} else {
				System.out.println("Please enter valid password");
			}
		}
	}

}
