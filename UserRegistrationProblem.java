package regex;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationProblem {
	static String input;

	public UserRegistrationProblem(String string) {
		this.input = string;
	}

	// UserName method for check Name Validation
	public static String UserFirstLastName() {
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher(input);
		boolean matchFound = matcher.find();
		if (matchFound)
			return "Valid Name";
		else
			return "Invalid Name";
	}

	// Email method for check Email Validation
	public static String EmailAddress() {
		Pattern pattern = Pattern.compile("^(abc.)[a-z]+@(bl.co.)[a-z]{2}$");
		Matcher matcher = pattern.matcher(input);
		boolean matchFound = matcher.find();
		if (matchFound)
			return "Valid Email Address";
		else
			return "Invalid Email Address";
	}

	// Mobile Number method for check Mobile Number Validation
	public static String MobileNumber() {
		Pattern pattern = Pattern.compile("^([+]\\d{2})?\\d{10}$");
		Matcher matcher = pattern.matcher(input);
		boolean matchFound = matcher.find();
		if (matchFound)
			return "Valid Mobile Number";
		else
			return "Invalid Mobile Number";
	}

	// Password method for check Password Validation
	public static String Password() {
		//
		Pattern pattern = Pattern.compile("(?=.*?[0-9])(?=.*[A-Z])(?=.*?[#?!@$%^&*-]).{8,}");
		Matcher matcher = pattern.matcher(input);
		boolean matchFound = matcher.find();
		if (matchFound)
			return "Valid Password";
		else
			return "Invalid Password";
	}

}
