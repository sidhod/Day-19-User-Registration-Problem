package regex;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationProblem {
	// UserName method for check Name Validation
	public static void UserFirstLastName(String input) {
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher(input);
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Valid Name\n");
		else
			System.out.println("Invalid Name\n");
	}

	// main
	public static void main(String[] args) {
		System.out.println("***************User Registration Problem*******************");

		// Get User First Name
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the First Name:");
		String FirstName = sc1.next();
		// pass first name to method
		UserFirstLastName(FirstName);

		// Get User Last Name
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter the Last Name:");
		String LastName = sc2.next();
		// Pass last name
		UserFirstLastName(LastName);

	}

}
