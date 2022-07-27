package com.corejava;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		int i, j, count = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
//		for (i = 0; i < n; i++) {
//			for (j = 0; j <= i; j++) {
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}
//		for (i = 0; i < n; i++) {
//			for (j = 0; j <= i; j++) {
//				System.out.print(count + " ");
//				count++;
//			}
//			System.out.println();
//		}
		for (i = 0; i < n; i++) {
			for (j = 1; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();

		}
//
//		for (i = 0; i < n; i++) {
//
//			for (j = n - i; j > 1; j--) {
//
//				System.out.print(" ");
//			}
//
//			for (int k = 0; k <= i; k++) {
//
//				System.out.print("* ");
//			}
//
//			System.out.println();
//		}
	}



	}

