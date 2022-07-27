package com.corejava;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a user input :");
		int num = sc.nextInt();
		int rev = 0;
		int originalNum = num;
		int rem = 0;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		System.out.println("Reverse of number is: " + rev);
		if (rev == originalNum) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");

		}
	}

}
