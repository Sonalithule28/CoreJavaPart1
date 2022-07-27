package com.corejava;
import java.util.Scanner;
public class AscendingOrderUsingLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a user input :");
		int num = sc.nextInt();
		int i = 1;
		int k = 1;
		System.out.println("\nAscending order using for loop: ");
		for (int j = 1; j <= num; j++) {
			System.out.println("value is:" + j);
		}
		System.out.println("\nAscending order using while loop: ");
		while (i <= num) {
			System.out.println("value is:" + i);
			i++;
		}
		System.out.println("\nAscending order using do while loop: ");
		do {
			System.out.println("value is:" + k);
			k++;
		} while (k <= num);

	}

	}


