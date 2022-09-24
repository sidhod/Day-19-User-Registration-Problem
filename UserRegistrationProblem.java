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

	// Email method for check Email Validation
	public static void EmailAddress(String input) {
		Pattern pattern = Pattern.compile("^(abc.)[a-z]+@(bl.co.)[a-z]{2}$");
		Matcher matcher = pattern.matcher(input);
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Valid Email Address\n");
		else
			System.out.println("Invalid Email Address\n");
	}

	// Mobile Number method for check Mobile Number Validation
	public static void MobileNumber(String input) {
		Pattern pattern = Pattern.compile("^[0-9]{1,2}\\\\s[0-9]{10}");
		Matcher matcher = pattern.matcher(input);
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Valid Mobile Number\n");
		else
			System.out.println("Invalid Mobile Number\n");
	}

	// Password method for check Password Validation
	public static void Password(String input) {
		Pattern pattern = Pattern.compile("(?=.*[a-z])(?=.*[A-Z]){8,}");
		Matcher matcher = pattern.matcher(input);
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Valid Password\n");
		else
			System.out.println("Invalid Password\n");
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

		// Get User Email Address
		Scanner sc3 = new Scanner(System.in);
		System.out.print("Enter the Email:");
		String Email = sc3.next();
		// Pass email address
		EmailAddress(Email);

		// Get User Mobile Number
		Scanner sc4 = new Scanner(System.in);
		System.out.print("Enter MobileNumber:");
		String MobileNumber = sc4.next();
		// Pass Mobile Number
		MobileNumber(MobileNumber);

		// Get User Password
		Scanner sc5 = new Scanner(System.in);
		System.out.print("Enter Password:");
		String Password = sc5.next();
		// Pass Mobile Number
		Password(Password);

	}

}
