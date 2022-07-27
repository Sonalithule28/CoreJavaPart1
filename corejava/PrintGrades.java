package com.corejava;

import java.util.Scanner;

public class PrintGrades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of student:");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int total = m1 + m2 + m3;
		int avg = total / 3;
		System.out.println("Average is: " + avg);
		if (avg > 80 && avg < 100) {
			System.out.println("A GRADE");
		} else if (avg > 60 && avg <= 80) {
			System.out.println("B GRADE");
		} else if (avg > 40 && avg <= 60) {
			System.out.println("C GRADE");
		} else {
			System.out.println("D GRADE");
		}

	}


	

}
