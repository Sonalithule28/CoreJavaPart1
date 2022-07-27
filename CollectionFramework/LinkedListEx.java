package com.CollectionFramework;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
	list.add("Sonali");
		list.add(0, "Janhavi");
	list.add(2, "Anu");
	list.addFirst("Netra"); // added element to the beginning
System.out.println("List of elements after adding netra: " + list);
	list.addLast("Gauri"); // added element to the last
	System.out.println("List of elements after adding gauri at last: " + list);
	System.out.println("Length of list: " + list.size());
	System.out.println("Get first element: " + list.getFirst());
	System.out.println(list.contains("Sonali"));
	System.out.println(list.isEmpty());
System.out.println("first element: " + list.peek());
	System.out.println("first element: " + list.poll());

	System.out.println("Set value into list: " + list.set(2, "SONU"));
	System.out.println("List of elements: " + list);
	System.out.println("List of elements: " + list);
}
	}

