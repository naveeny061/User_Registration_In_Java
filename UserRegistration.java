package pattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean validateFirstName(String firstname) {
		String expression = "^[A-Z][a-z]{2,}$";
		Pattern pattern = Pattern.compile(expression);
		return pattern.matcher(firstname).matches();
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
				System.out.println("First name starts with Cap and has minimum 3 characters");
			}
		}
	}

}
