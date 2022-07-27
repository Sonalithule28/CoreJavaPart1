package com.Exception;

public class InvalidProductException1 {
	void productCheck(int weight) throws InvalidProductException {
		if (weight < 100) {
			throw new InvalidProductException("Product invalid");

		}

	}

	public static void main(String[] args) {
		InvalidProductException1 obj = new InvalidProductException1();
		try {
			obj.productCheck(180);
		} catch (InvalidProductException ex) {
			System.out.println("caught exception");
			System.out.println(ex.getMessage());
		}

	}

	
}
