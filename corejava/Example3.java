package com.corejava;

public class Example3 {

	public static void main(String[] args) {
		int i1 = 1;
		int i2 = 1;
		String str1 = new String("str");
		String str2 = new String("str");
		String str3 = "str";
		String str4 = "str";
		System.out.println(i1 == i2);
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str3 == str4);

	}

}
