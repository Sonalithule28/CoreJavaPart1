package com.Exception;

public class NullException {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println("String length:" + str.length());
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
