package regex;

import org.junit.Assert;
import org.junit.Test;

import stack.ExceptionDemo;

public class UserRegistrationProblemTest {
	// JUnit Test for sample emails
	@Test
	public void CheckEmailValidation1() {
		UserRegistrationProblem Email = new UserRegistrationProblem("abc@yahoo.com");
		String actualResult = Email.EmailAddress();
		Assert.assertEquals("Valid Email Address", actualResult);
	}

	@Test
	public void CheckEmailValidation2() {
		UserRegistrationProblem Email = new UserRegistrationProblem("abc-100@yahoo.com");
		String actualResult = Email.EmailAddress();
		Assert.assertEquals("Valid Email Address", actualResult);
	}

	@Test
	public void CheckEmailValidation3() {
		UserRegistrationProblem Email = new UserRegistrationProblem("abc123@.com.my");
		String actualResult = Email.EmailAddress();
		Assert.assertEquals("Valid Email Address", actualResult);
	}

	@Test
	public void CheckEmailValidation4() {
		UserRegistrationProblem Email = new UserRegistrationProblem("abc.100@yahoo.com");
		String actualResult = Email.EmailAddress();
		Assert.assertEquals("Valid Email Address", actualResult);
	}

	@Test
	public void CheckEmailValidation5() {
		UserRegistrationProblem Email = new UserRegistrationProblem("abc111@abc.com");
		String actualResult = Email.EmailAddress();
		Assert.assertEquals("Valid Email Address", actualResult);
	}

	@Test
	public void CheckEmailValidation6() {
		UserRegistrationProblem Email = new UserRegistrationProblem("abc+100@gmail.com");
		String actualResult = Email.EmailAddress();
		Assert.assertEquals("Valid Email Address", actualResult);
	}

	@Test
	public void CheckEmailValidation7() {
		UserRegistrationProblem Email = new UserRegistrationProblem("abc@gmail.com.com");
		String actualResult = Email.EmailAddress();
		Assert.assertEquals("Valid Email Address", actualResult);
	}

}
