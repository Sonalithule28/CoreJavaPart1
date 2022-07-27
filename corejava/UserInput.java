package com.corejava;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Your Full Name: ");
		String name1 = sc.nextLine();
		System.out.println("Your full Name is: " + name1);

		System.out.println("Your Name: ");
		String name = sc.next();
		System.out.println("Your Name is: " + name);

		System.out.println("Enter your roll no.: ");
		int rollNo = sc.nextInt();
		System.out.println("Roll no is: " + rollNo);
	}

}
