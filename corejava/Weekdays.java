package com.corejava;

import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a user input :");
		int weekDay = sc.nextInt();
		String day = "";
		switch (weekDay) {
		case 1:
			day = "Sunday";
			System.out.println("Day is: " + day);
			break;

		case 2:
			day = "Monday";
			System.out.println("Day is: " + day);
			break;

		case 3:
			day = "Tuesday";
			System.out.println("Day is: " + day);
			break;

		case 4:
			day = "Wednesday";
			System.out.println("Day is: " + day);
			break;
		case 5:
			day = "Thursday";
			System.out.println("Day is: " + day);
			// break;
		case 6:
			day = "Friday";
			System.out.println("Day is: " + day);
			// break;
		case 7:
			day = "Saturday";
			System.out.println("Day is: " + day);
			// break;

		default:
			System.out.println("Invalid Input");
		}

	}

}
