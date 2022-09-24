package regex;

import org.junit.Assert;
import org.junit.Test;

import stack.ExceptionDemo;

public class UserRegistrationProblemTest {
	@Test
	public void CheckFirstNameValidation() {
		UserRegistrationProblem FirstName = new UserRegistrationProblem("Sai");
		String actualResult = FirstName.UserFirstLastName();
		
		Assert.assertEquals("Valid Name",actualResult);
		
	}
	@Test
	public void CheckLastNameValidation() {
		UserRegistrationProblem LastName = new UserRegistrationProblem("Kamble");
		String actualResult = LastName.UserFirstLastName();
		
		Assert.assertEquals("Valid Name",actualResult);
		
	}
	@Test
	public void CheckEmailValidation() {
		UserRegistrationProblem Email = new UserRegistrationProblem("abc.xyz@bl.co.in");
		String actualResult = Email.EmailAddress();
		
		Assert.assertEquals("Valid Email Address",actualResult);
		
	}
	@Test
	public void CheckMobileNumberValidation() {
		UserRegistrationProblem MobileNumber = new UserRegistrationProblem("+910123456789");
		String actualResult = MobileNumber.MobileNumber();
		
		Assert.assertEquals("Valid Mobile Number",actualResult);
		
	}
	@Test
	public void CheckPasswordValidation() {
		UserRegistrationProblem Password = new UserRegistrationProblem("Pass@1asdf");
		String actualResult = Password.Password();
		
		Assert.assertEquals("Valid Password",actualResult);
		
	}
	

	

}
