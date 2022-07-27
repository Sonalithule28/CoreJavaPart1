package com.corejava;

import java.util.Scanner;

public class ArrayOperations1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		int c1 = 0, c2 = 0, c3 = 0;
		System.out.println("Enter a elements in array: ");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				System.out.print(num[i] + " ");
				c1++;
			} else if (num[i] < 0) {
				System.out.print(num[i] + " ");
				c2++;
			} else {
				System.out.print(num[i] + " ");
				c3++;
			}

		}
		System.out.println("\nPositive number count is: " + c1);
		System.out.println("Negative number count is: " + c2);
		System.out.println("zero number count is: " + c3);

	}

}
