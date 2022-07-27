package com.corejava;

public class LogicalOperations {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		boolean result;
		System.out.println("AND Operations: ");
		result = ((num1 > num2) && (num1 < num2));
		System.out.println("the result is: " + result);

		result = ((num1 < num2) && (num1 > num2));
		System.out.println("the result is: " + result);

		result = ((num1 > num2) && (num2 < num1));
		System.out.println("the result is: " + result);

		result = ((num1 < num2) && (num2 > num1));
		System.out.println("the result is: " + result);

		System.out.println("OR Operations: ");

		result = ((num1 > num2) || (num1 < num2));
		System.out.println("the result is: " + result);

		result = ((num1 < num2) || (num1 > num2));
		System.out.println("the result is: " + result);

		result = ((num1 < num2) || (num2 > num1));
		System.out.println("the result is: " + result);

		result = ((num1 > num2) || (num2 < num1));
		System.out.println("the result is: " + result);

		int result1 = (num1 > num2) ? num1 : num2;
		System.out.println(result1);
	}

}
