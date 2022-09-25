package regex;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationProblem {
	static String input;

	public UserRegistrationProblem(String string) {
		this.input = string;
	}

	// Email method for check Email Validation
	public static String EmailAddress() {
		Pattern pattern = Pattern.compile("^(.+)@(.+)$");
		Matcher matcher = pattern.matcher(input);
		boolean matchFound = matcher.find();
		if (matchFound)
			return "Valid Email Address";
		else
			return "Invalid Email Address";
	}

}
