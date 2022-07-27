package com.corejava;

public class VariableTypes {
	static int num1 = 99;

	public static void main(String[] args) {
		int num = 96;
		method1();
		System.out.println("num1 is: " + VariableTypes.num1);
		System.out.println("num is: " + num);
	}

	public static void method1() {
		int num2 = 69;
		System.out.println("num2 is: " + (++num2));

	
	}
}

