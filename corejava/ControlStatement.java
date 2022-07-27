package com.corejava;

import java.util.Scanner;

public class ControlStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = 0;
		if (a > b && a > c) {
			max = a;
			System.out.println("maximum no. is: " + max);
		} else if (b > a && b > c) {
			max = b;
			System.out.println("maximum no. is: " + max);
		} else {
			max = c;
			System.out.println("maximum no. is: " + max);
		}

	}

}
