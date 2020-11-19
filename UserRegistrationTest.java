package pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Assert;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateFirstName("Naveen");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateFirstName("Na");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateFirstName("N@veen");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenFirstName_WhenWithNumeric_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateFirstName("Naveen1");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenFirstName_WhenWithFirstLetterSmall_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateFirstName("naveen");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenFirstName_WhenWithBlankSpaces_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateFirstName("na veen");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateLastName("Yadav");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateLastName("Ya");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenWithSpChars_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateLastName("Y@dav");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenWithNumeric_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateLastName("Yadav1");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenWithFirstLetterSmall_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateLastName("yadav");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenWithBlankSpaces_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateLastName("ya dav");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateEmail("abc@yahoo.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenWithSplCharShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateEmail("abc-100@yahoo.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenWithDotInPrefix_ShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateEmail("abc.100@yahoo.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenWithDigitsAndNumber_ShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateEmail("abc111@abc.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenWithTwoTLD_ShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateEmail("abc.100@abc.com.au");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenWithNumberInTLD_ShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateEmail("abc@1.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenWithPlus_ShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateEmail("abc+100@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenWithoutAtTheRateSymbol_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateEmail("naveeny061gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenTldDoesNotStartWithDot_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateEmail("abc@.com.my");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenShortTld_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateEmail("abc123@gmail.a");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenStartWithDot_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateEmail(".abc@abc.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenWithSplCharExceptUnderScoreOrDash_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateEmail("abc()*@gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenTldOnlyCharOrDigit_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateEmail("abc@%*.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenWithDoubleDot_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateEmail("abc..2002@gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenEmailNameEndWithDot_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateEmail("abc.@gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenWithDoubleAtTheRate_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateEmail("abc@abc@gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenTldWithDigit_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateEmail("abc@gmail.com.1a");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenMoreThanTwoTld_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateEmail("abc@gmail.com.aa.au");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenMobile_WhenWithCountryCode_ShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateMobile("91 1234567890");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenMobile_WhenWithPlusCountryCode_ShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateMobile("+91 1234567890");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenMobile_WhenNoCountryCode_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateMobile("1234567890");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenMobile_WhenWithPlusButNoCountryCode_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateMobile("+ 1234567890");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenMobile_WhenNoGap_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateMobile("+911234567890");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenMobile_WhenShort_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validateMobile("91 12345678");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validatePassword("Q1qwer@wr");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPassword_WhenShort_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validatePassword("Q1W@w");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenWithOutUpperCase_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validatePassword("qw!1qwerr");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenWithOutNumeric_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validatePassword("Qqwer@wr");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenMoreSplChar_ShouldReturnFalse() {
		UserRegistration userValidation = new UserRegistration();
		boolean result = userValidation.validatePassword("Qqwe!r@wr");
		Assert.assertEquals(false, result);
	}

}
