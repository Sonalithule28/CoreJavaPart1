package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<String> list = new ArrayList<String>(25);
		list.add("Sonali");
		list.add(0, "Janhavi");
		list.add(null);
		list.add("Anu");
		list.add(2, "Gauri");
		System.out.println("List of elements: " + list);
		System.out.println("Length of list: " + list.size());
		System.out.println("Get value from list: " + list.get(0));
		System.out.println("Set value into list: " + list.set(2, "Janu"));
		System.out.println("List of elements: " + list);
		System.out.println("Remove element from list: " + list.remove(0));
		System.out.println("List of elements: " + list);
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		String arr[] = list.toArray(new String[0]);
		System.out.println("Array of elements: " + list);

		for (String s : arr) {
			System.out.println(s);
		}
	}

}
