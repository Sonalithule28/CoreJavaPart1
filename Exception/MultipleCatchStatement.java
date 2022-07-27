package com.Exception;

public class MultipleCatchStatement {

	public static void main(String[] args) {
		try {
			int a[] = new int[3];
			a[8] = 30 / 5;

		} catch (ArithmeticException ae) {
			System.out.println("Arithmatic Exception");
		} catch (ArrayIndexOutOfBoundsException ar) {
			System.out.println("Array index exception");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("end...............");
		}

	}

}
