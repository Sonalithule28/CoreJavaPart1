package com.corejava;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int count = 0, i, j;
//	 to check whether a num1 is prime or not
//		if (num == 1 || num == 0) {
//			System.out.println("Neither Prime nor Composite!");
//		} else {
//			for (i = 1; i <= num; i++) {
//				if (num % i == 0) {
//					count++;
//				}
//			}
//			if (count == 2) {
//				System.out.println(num + " is a prime number!");
//			} else {
//				System.out.println(num + " is not prime number!");
//
//			}
//		}

		// print prime number between 1 to n
		if (num == 1 || num == 0) {
			System.out.println("Neither Prime nor Composite!");
		} else {
			System.out.println("Prime numbers between 1 to " + num+ " are: ");
			for (j = 2; j <= num; j++) {
				count = 0;
				for (i = 1; i <= j; i++) {
					if (j % i == 0) {
						count++;
					}
				}
				if (count == 2)
					System.out.print(j + "  ");
			}
		}
	}

}
