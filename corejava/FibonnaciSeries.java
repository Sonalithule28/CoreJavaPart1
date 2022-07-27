package com.corejava;

import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a user input :");
		int num = sc.nextInt();
		int f0 = 0;
		int f1 = 1, f2 = 0;
		System.out.print(f0 + " " + f1);
		for (int i = 1; i <= num; i++)
			f2 = f0 + f1;
		System.out.print(" " + f2);
		f0 = f1;
		f1 = f2;
	}

}
