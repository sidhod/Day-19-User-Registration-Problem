package regex;

import java.util.regex.*;

public class UserRegistrationProblem {

	// Email method for check Email Validation
	public static void EmailAddress(String input) {
		Pattern pattern = Pattern.compile("^(abc)[-.+0-9a-z]*@[a-z0-9]+[.][a-z]{0,3}[.]?[a-z]{0,2}$");
		Matcher matcher = pattern.matcher(input);
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println(input + " :-Valid Email Address\n");
		else
			System.out.println(input + " :-Invalid Email Address\n");
	}

	// main
	public static void main(String[] args) {
		System.out.println("***************User Registration Problem*******************");
		// Samples of emails
		String[] emails = { "abc@yahoo.com", "abc-100@yahoo.com", "abc123@.com.my", "abc.100@yahoo.com",
				"abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com",
				"abc+100@gmail.com" };

		// pass emails to method email
		for (int i = 0; i <= emails.length - 1; i++) {
			EmailAddress(emails[i]);
		}

	}

}
