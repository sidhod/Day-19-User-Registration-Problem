package regex;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationProblem {
	// UserName method for check Name Validation
	public static void UserName(String input) {
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher(input);
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Valid Name");
		else
			System.out.println("Invalid Name");
	}

	// main
	public static void main(String[] args) {
		System.out.println("***************User Registration Problem*******************");

		// Get User name
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Name:");
		String FirstName = sc.next();
		UserName(FirstName);

	}

}
