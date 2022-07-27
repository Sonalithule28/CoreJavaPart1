package com.CollectionFramework;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Sonu");
		ts.add("Janu");
		ts.add("Sam");
		ts.add("Champ");
		 
		System.out.println("Treeset data is: " + ts);
		ArrayList<String> list = new ArrayList<>(ts);
		System.out.println("Arraylist of names: " + list);

	}

}
