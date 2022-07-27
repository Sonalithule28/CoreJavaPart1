package com.corejava;

public class StringOP {

	public static void main(String[] args) {
		String str = "Black";
		String str1 = "black";
		String str2 = "  Pink";
		System.out.println("Length of string is: " + str.length());
		System.out.println("UpperCase :" + str.toUpperCase());
		System.out.println("LowerCase :" + str.toLowerCase());
		System.out.println("Is both strings are equal: " + str.equals(str1));
		System.out.println("Is both strings are equal: " + str.equalsIgnoreCase(str1));
		System.out.println("Concate string: " + str.concat(" Clouds"));
		System.out.println("Index of: " + str.indexOf('c'));
		System.out.println("replace string: " + str.replace("Black", "Pink"));
		System.out.println("contains of: " + str.contains("k"));
		System.out.println("Substring: " + str.substring(0, 3));
		System.out.println("trim :" + str2.trim());
	}

}
