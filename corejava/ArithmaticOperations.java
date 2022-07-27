package com.corejava;
import java.util.Scanner;
public class ArithmaticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int value1, value2, input;
		System.out.println("********** ARITHMATIC CALCULATOR **********");
		do {
			System.out.println("Enter a operation you want: ");
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Modulo");
			System.out.println("6.Power operation");
			System.out.println("7.Squareroot operation");
			System.out.println("8.Exit");

			System.out.println("Enter a user input :");
			input = sc.nextInt();
			double result;
			switch (input) {
			case 1:
				System.out.println("Enter first value:");
				value1 = sc.nextInt();
				System.out.println("Enter second value :");
				value2 = sc.nextInt();
				result = value1 + value2;
				System.out.println("Addition result is: " + result);
				break;

			case 2:
				System.out.println("Enter first value:");
				value1 = sc.nextInt();
				System.out.println("Enter second value :");
				value2 = sc.nextInt();
				result = value1 - value2;
				System.out.println("Substraction result is: " + result);
				break;

			case 3:
				System.out.println("Enter first value:");
				value1 = sc.nextInt();
				System.out.println("Enter second value :");
				value2 = sc.nextInt();
				result = value1 * value2;
				System.out.println("Multiplication result is: " + result);
				break;

			case 4:
				System.out.println("Enter first value:");
				value1 = sc.nextInt();
				System.out.println("Enter second value :");
				value2 = sc.nextInt();
				result = value1 / value2;
				System.out.println("Division result is: " + result);
				break;
			case 5:
				System.out.println("Enter first value:");
				value1 = sc.nextInt();
				System.out.println("Enter second value :");
				value2 = sc.nextInt();
				result = value1 % value2;
				System.out.println("Modulo result is: " + result);
				break;
			case 6:
				System.out.println("Enter number:");
				value1 = sc.nextInt();
				System.out.println("Enter power :");
				value2 = sc.nextInt();
				result = Math.pow(value1, value2);
				System.out.println("result of power operation is: " + result);
				break;
			case 7:
				System.out.println("Enter number:");
				value1 = sc.nextInt();
				result = Math.sqrt(value1);
				System.out.println("Squareroot result is: " + result);
				break;
			case 8:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");
				input++;
			}

		} while (input != 8);
	}

	}

