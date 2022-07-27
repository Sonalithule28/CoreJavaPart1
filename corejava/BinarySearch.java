package com.corejava;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, first, last;
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
		first = 0;
		last = num.length - 1;
		System.out.println("\nEnter element want to search: ");
		search = sc.nextInt();
		int mid = (first + last) / 2;
		while (first <= last) {
			if (num[mid] == search) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else if (num[mid] < search) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element is not found!");
		}
	}



	}


