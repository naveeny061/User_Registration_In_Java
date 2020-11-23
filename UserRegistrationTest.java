package pattern;

import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
		try {
			UserRegistration userValidation = new UserRegistration();

			userValidation.validateFirstName();
		} catch (UserRegistrationException e) {
			//e.printStackTrace();
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID, "Invalid First Name");

		}
	}

///////////////////////////////////////////////////////////////////////////////////////////////
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
		try {
			UserRegistration userValidation = new UserRegistration();

			userValidation.validateLastName();
			;
		} catch (UserRegistrationException e) {
			e.printStackTrace();
			//throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID, "Invalid Last Name");

		}
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		try {
			UserRegistration userValidation = new UserRegistration();

			userValidation.validateEmail();
		} catch (UserRegistrationException e) {
			e.printStackTrace();

		}
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Test
	public void givenMobile_WhenWithCountryCode_ShouldReturnTrue() {
		try {
			UserRegistration userValidation = new UserRegistration();

			userValidation.validateMobile();
		} catch (UserRegistrationException e) {
			e.printStackTrace();

		}
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		try {
			UserRegistration userValidation = new UserRegistration();

			userValidation.validatePassword();
			;
		} catch (UserRegistrationException e) {
			e.printStackTrace();

		}
	}
}
