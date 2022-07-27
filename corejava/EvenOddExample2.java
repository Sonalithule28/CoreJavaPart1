package com.corejava;

import java.util.Scanner;

public class EvenOddExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		System.out.println("Even Numbers: ");
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\nOdd Numbers: ");

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
	}

	}


