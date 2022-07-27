package com.corejava;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int search;
		System.out.println("Enter size of array: ");
		n = sc.nextInt();
		int num[] = new int[n];
		System.out.println("Enter a elements in array: ");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
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
		System.out.println("Sorted Array: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println("\nEnter element want to search: ");
		search = sc.nextInt();
		int temp = 0, j;
		for (j = 0; j < num.length; j++) {
			if (num[j] == search) {
				temp = 1;
				break;
			} else {
				temp = 0;
			}
		}
		if (temp == 1) {
			System.out.println("Element is found at index: " + j);
		} else {
			System.out.println("Element is not found!");
		}

	}

}
