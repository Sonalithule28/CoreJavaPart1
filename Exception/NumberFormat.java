package com.Exception;

public class NumberFormat {

	public static void main(String[] args) {
		try {
			String str = "sonali";
			int i = Integer.parseInt(str);
			System.out.println("String Format:" + i);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
