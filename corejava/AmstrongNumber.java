package com.corejava;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a user input :");
			int num = sc.nextInt();
			int originalNum = num;
			int result = 0;
			int rem = 0;
			while (num != 0) {
				rem = num % 10;
				result = result + rem * rem * rem;
			result = (int) (result + Math.pow(rem, 3));
				num /= 10;
			}
			if (originalNum == result) {
				System.out.println("Number is ArmstrongNumber :" + originalNum);

			} else {
				System.out.println("Number is not ArmstrongNumber :" + originalNum);

			}
		}


	}


