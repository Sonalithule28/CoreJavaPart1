package com.corejava;

import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a user input :");
		int sum = 0;
		int num = sc.nextInt();
//		for (int i = 1; i <= num; i++) {
//			sum += i;
//		}
//		sum = num * (num + 1) / 2;
		int i = 1;
		while (i <= num) {
			sum += i;
			i++;
		}
		System.out.println("Sum of numbers is: " + sum);
	}

}
