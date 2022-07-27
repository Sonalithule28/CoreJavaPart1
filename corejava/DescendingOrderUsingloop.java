package com.corejava;

import java.util.Scanner;

public class DescendingOrderUsingloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a user input :");
		int num = sc.nextInt();
		int i = num;
		int k = num;
		System.out.println("\nDescending order using for loop: ");
		for (int j = num; j >= 1; j--) {
			System.out.println("value is:" + j);
		}
		System.out.println("\nDescending order using while loop: ");
		while (i >= 1) {
			System.out.println("value is:" + i);
			i--;
		}
		System.out.println("\nDescending order using do while loop: ");
		do {
			System.out.println("value is:" + k);
			k--;
		} while (k >= 1);

	}

	}


