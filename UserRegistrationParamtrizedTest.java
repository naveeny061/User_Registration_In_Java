package pattern;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Before;

@RunWith(Parameterized.class)

public class UserRegistrationParamtrizedTest {
	private String email;
	private boolean expectedResult;
	private UserRegistration userRegistration;

	public UserRegistrationParamtrizedTest(String email, boolean expectedResult) {
		super();
		this.email = email;
		this.expectedResult = expectedResult;
	}

	@Before
	public void initialize() {
		userRegistration = new UserRegistration();
	}

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, { "abc1.com", false }, { "abc@.1.com", false }, { "abc@1.c", false },
				{ ".abc@1.com", false }, { "abc()@1.com", false }, { "abc@1..com", false }, { "abc.@1.com", false },
				{ "ab@c@1.com", false}, { "abc@1.1om.p1", false }, { "abc@1.com.co.in", false } });
	}

	@Test
	public void testUserRegistrationTest() {
		assertEquals(expectedResult, userRegistration.validateEmail(email));
	}
}
