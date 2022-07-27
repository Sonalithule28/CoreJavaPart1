package com.Exception;

import java.util.Scanner;

class NameNotExistException1 extends Exception {
	public NameNotExistException1(String s) {
		super(s);
	}

}

public class NameNotExistException {
	public static void main(String[] args) {
		String names[] = { "Sonali", "Janhavi", "Jagruti", "Anu" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name1 = sc.nextLine();
		try {
			CheckNameExist(name1, names);
		} catch (NameNotExistException1 e) {
			System.err.println(e.getMessage());
		}

	}

	private static void CheckNameExist(String name1, String[] names) throws NameNotExistException1 {
		for (String str : names) {

			if (name1.equalsIgnoreCase(str)) {
				System.out.println("Name is exist");
				break;
			} else {
				throw new NameNotExistException1("Name not exist");
			}
		}

	}
}
