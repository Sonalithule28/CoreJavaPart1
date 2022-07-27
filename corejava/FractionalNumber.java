package com.corejava;

import java.util.Scanner;

public class FractionalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a user input :");
		int num = sc.nextInt();
		int i = 1;
		int fact = 1;
//		for (int i = 1; i <= num; i++) {
//			fact *= i;
//		}
//		System.out.println("factorial of number: " + fact);
		while (i <= num) {
			fact *= i;
			i++;
		}
		System.out.println("factorial of number: " + fact);
	}

}
