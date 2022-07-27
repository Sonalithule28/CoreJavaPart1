package com.corejava;

public class BitwiseOperator {

	public static void main(String[] args) {
		int a = 8;
		System.out.println("Before shift: " + a);

		int b;
		b = a << 2;
		System.out.println("After left shift: " + b);
		b = a >> 2;
		System.out.println("After right shift: " + b);


	}

}
