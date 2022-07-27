package com.corejava;

public class ExampleOfPrePost {

	public static void main(String[] args) {
		int num1 = 20, num2 = 10, num3 = 30, num4 = 40;
		int a, b, c, d;
		a = ++num1;
		b = num2++;
		c = --num3;
		d = num4--;
		System.out.println("Pre-increment is: " + a);
		System.out.println("Post-increment is: " + b);
		System.out.println("Pre-decrement is: " + c);
		System.out.println("Post-decrement is: " + d);
	}

}
