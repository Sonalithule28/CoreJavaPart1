package com.Java8Features;

import java.util.function.BiFunction;

class Multiplication {
	public static int multiply(int a, int b) {
		return a * b;
	}
}

public class StaticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;
		int pr = product.apply(6, 2);
		System.out.println("Product:" + pr);
	}

}
