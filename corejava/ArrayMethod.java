package com.corejava;

import java.util.Arrays;

public class ArrayMethod {

	public static void main(String[] args) {

			int a[] = { 1, 4, 2, 6, 8 };
			String arr[] = { "Black", "Blue", "Pink", "Green" };
			String arr1[] = Arrays.copyOf(arr, 4);
			Arrays.sort(arr);
//			int b[] = Arrays.copyOfRange(a, 0, 3);
			int c = Arrays.binarySearch(arr, "Pink");

			System.out.println("Sorted Array: ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
//			System.out.println("\nelements in b Array: ");
//			for (int i = 0; i < b.length; i++) {
////				b[i]++;
//				System.out.print(b[i] + " ");
//			}
			System.out.println("\nElement is found at index: " + c);
		}


	}


