package com.Exception;

import java.util.Scanner;

class InvalidNameCustomException extends Exception {
	public InvalidNameCustomException(String s) {
		super(s);
	}
}

public class InvalidNameCustomException1 {

	public static void main(String[] args) {
		InvalidNameCustomException1 obj = new InvalidNameCustomException1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstname = sc.nextLine();
		System.out.println("Enter your last name");
		String lastname = sc.nextLine();
		try {
			obj.printfullname(firstname, lastname);
		} catch (InvalidNameCustomException e) {
			System.err.println(e.getMessage());
		}
	}

	private void printfullname(String firstname, String lastname) throws InvalidNameCustomException {
		if (firstname.isEmpty() || lastname.isEmpty()) {
			throw new InvalidNameCustomException("Invalid Name Exception");
		} else {
			System.out.println("firstname:" + firstname);
			System.out.println("lastname:" + lastname);
		}
	}

}
