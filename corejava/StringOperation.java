package com.corejava;

import java.util.Arrays;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= new String(" ");
		System.out.println("Empty:" +str1.isEmpty());
		System.out.println("Blank:" +str1.isBlank());
		System.out.println("compare to:"+"java".compareTo("JAVA"));
		System.out.println("compare to ignorecase:"+"java".compareToIgnoreCase("database"));
		System.out.println("startwith:"+"data".startsWith("d"));
		System.out.println("endwith:"+"cat".endsWith("at"));
		  
		String str2 ="      core       ";
		String str3="c++";
	//	System.out.println("trim:"+str2.trim());
	//	System.out.println("strip:"+str2.strip());
		System.out.println("leading:"+str2.stripLeading());
		System.out.println("trailing:"+str2.stripTrailing());
		
		String s1="JAVA";
		char str4[]= new char[4];
		s1.getChars(0, 4, str4, 0);
		System.out.println("getChars method:" + Arrays.toString(str4));
	//	System.out.println("tochararray:" +s1.toCharArray());


		
				

	}

}
