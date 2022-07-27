package com.corejava;

import java.util.Scanner;

public class ArrayOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int num[] = new int[5];
		int row, col;
		System.out.println("Enter a number of rows: ");
		row = sc.nextInt();
		System.out.println("Enter a number of columns: ");
		col = sc.nextInt();
		int num1[][] = new int[row][col];
		int num2[][] = new int[row][col];
//		System.out.println("Enter a elements in array: ");
		// 1D array
//		for (int i = 0; i < num.length; i++) {
//			num[i] = sc.nextInt();
//		}
//		System.out.println("Elements in array are:");
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
		// 2D array
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				num1[i][j] = sc.nextInt();
//
//			}
//		}
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				System.out.print(num1[i][j] + " ");
//			}
//			System.out.println();
//		}

		// array addition
		System.out.println("Enter a elements in first array: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				num1[i][j] = sc.nextInt();

			}
		}
		System.out.println("Elements in first array: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(num1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Enter a elements in second array: ");

		for (int k = 0; k < row; k++) {
			for (int l = 0; l < col; l++) {
				num2[l][k] = sc.nextInt();

			}
		}
		System.out.println("Elements in second array: ");
		for (int k = 0; k < row; k++) {
			for (int l = 0; l < col; l++) {
				System.out.print(num2[k][l] + " ");
			}
			System.out.println();

		}
		System.out.println("Addition of both the array elements: ");
		for (int m = 0; m < row; m++) {
			for (int n = 0; n < col; n++) {
				System.out.print((num1[m][n] + num2[m][n]) + " ");
			}
			System.out.println();
		}

	}




	}


