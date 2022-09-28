package regex;

import java.util.Scanner;
import java.util.regex.*;
import stack.CustomException;

//Create interface
@FunctionalInterface
interface DemoLambda {
	Boolean printResult(String string);

	static void printValidation(String parameter, DemoLambda interfaceReferenceParam) {
		System.out.print(parameter + ":");
		if (interfaceReferenceParam.printResult(parameter))
			System.out.print(" Valid\n");
		else
			System.out.print(" Invalid\n");

	}
}

public class UserRegistrationProblem {

	public static void main(String[] args) {
		System.out.println("***************User Registration Problem*******************");
		// Reference for First Name
		DemoLambda firstNameReference = (param) -> {
			Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
			Matcher matcher = pattern.matcher(param);
			boolean matchFound = matcher.find();
			return matchFound;
		};
		// Reference for Last Name
		DemoLambda lastNameReference = (param) -> {
			Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
			Matcher matcher = pattern.matcher(param);
			boolean matchFound = matcher.find();
			return matchFound;
		};
		// Reference for email
		DemoLambda emailReference = (param) -> {
			Pattern pattern = Pattern.compile("^(abc.)[a-z]+@(bl.co.)[a-z]{2}$");
			Matcher matcher = pattern.matcher(param);
			boolean matchFound = matcher.find();
			return matchFound;
		};
		// Reference for Mobile Number
		DemoLambda mobileNoReference = (param) -> {
			Pattern pattern = Pattern.compile("^[0-9]{1,2}\\s[0-9]{10}");
			Matcher matcher = pattern.matcher(param);
			boolean matchFound = matcher.find();
			return matchFound;
		};
		// Reference for Password
		DemoLambda passwordReference = (param) -> {
			Pattern pattern = Pattern.compile("(?=.*?[0-9])(?=.*[A-Z]){8,}");
			Matcher matcher = pattern.matcher(param);
			boolean matchFound = matcher.find();
			return matchFound;
		};
		// Pass value and reference to lambda function
		DemoLambda.printValidation("Sai", firstNameReference);
		DemoLambda.printValidation("Kamble", lastNameReference);
		DemoLambda.printValidation("abc.xyz@bl.co.in", emailReference);
		DemoLambda.printValidation("91 7589645895", mobileNoReference);
		DemoLambda.printValidation("Pass@123", passwordReference);

	}

}
