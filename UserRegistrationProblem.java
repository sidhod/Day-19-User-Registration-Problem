package regex;

import java.util.Scanner;
import java.util.regex.*;

import stack.CustomException;

public class UserRegistrationProblem {

	// UserName method for check Name Validation
	public static void UserFirstLastName(String input) throws CustomException1 {
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher(input);
		boolean matchFound = matcher.find();
		//Add custome exception for null data pass
		try {
			if (matchFound)
				System.out.println("Valid Name\n");
			else
				System.out.println("Invalid Name\n");
		} catch (Exception e) {
			throw new CustomException1("Enter Valid Name");
		}
	}

	public static void EmailAddress(String input) throws CustomException1 {
		Pattern pattern = Pattern.compile("^(abc.)[a-z]+@(bl.co.)[a-z]{2}$");
		Matcher matcher = pattern.matcher(input);
		boolean matchFound = matcher.find();
		//Add custome exception for null data pass
		try {
			if (matchFound)
				System.out.println("Valid Email Address\\n");
			else
				System.out.println("Invalid Email Address\\n");
		} catch (Exception e) {
			throw new CustomException1("Enter Valid Email Address");
		}
	}

	// Mobile Number method for check Mobile Number Validation
	public static void MobileNumber(String input) throws CustomException1 {
		Pattern pattern = Pattern.compile("^[0-9]{1,2}\\\\s[0-9]{10}");
		Matcher matcher = pattern.matcher(input);
		boolean matchFound = matcher.find();
		//Add custome exception for null data pass
		try {
			if (matchFound)
				System.out.println("Valid Mobile Number\n");
			else
				System.out.println("Invalid Mobile Number\n");
		} catch (Exception e) {
			throw new CustomException1("Enter Valid Mobile Number");
		}
	}

	// Password method for check Password Validation
	public static void Password(String input) throws CustomException1 {
		//
		Pattern pattern = Pattern.compile("(?=.*?[0-9])(?=.*[A-Z]){8,}");
		Matcher matcher = pattern.matcher(input);
		boolean matchFound = matcher.find();
		//Add custome exception for null data pass
		try {
			if (matchFound)
				System.out.println("Valid Password\n");
			else
				System.out.println("Invalid Password\n");

		} catch (Exception e) {
			throw new CustomException1("Enter Valid Email Address");
		}
	}

	public static void main(String[] args) throws CustomException1 {
		System.out.println("***************User Registration Problem*******************");
		//show custome exception 
		try {
			UserFirstLastName("sai");
		} catch (Exception e) {
			throw new CustomException1("Enter Valid First Name");
		}
		//show custome exception 
		try {
			UserFirstLastName("Kamble");
		} catch (Exception e) {
			throw new CustomException1("Enter Valid Last Name");
		}
		//show custome exception 
		try {
			EmailAddress(null);
		} catch (Exception e) {
			throw new CustomException1("Enter Valid Email Address");
		}
		//show custome exception 
		try {
			MobileNumber(null);
		} catch (Exception e) {
			throw new CustomException1("Enter Valid Mobile Number");
		}
		//show custome exception 
		try {
			Password(null);
		} catch (Exception e) {
			throw new CustomException1("Enter Valid Password");
		}
	}

}
