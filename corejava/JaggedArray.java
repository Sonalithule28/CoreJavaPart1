package com.corejava;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1[][] = new int[2][3];
		System.out.println("Enter a elements in array: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				num1[i][j] = sc.nextInt();

			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(num1[i][j] + " ");
			}
			System.out.println();

		}

	}

}
