package com.corejava;

import java.util.Scanner;

public class SortingArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter size of array: ");
		n = sc.nextInt();
		int num[] = new int[n];
		System.out.println("Enter a elements in array: ");
		// 2,4,5,1,7
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("Elements before sorting in array are:");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - i - 1; j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}

			}
		}
		System.out.println("\nElements after sorting in array are:");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
