package com.CollectionFramework;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		HashSet<Integer> h1 = new HashSet<>();
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(4);

		HashSet<Integer> h2 = new HashSet<>();
		h2.add(2);
		h2.add(3);
		h2.add(5);
		h1.addAll(h2);
		System.out.println(h1);
		System.out.println(h1.retainAll(h2));
		System.out.println(h2.removeAll(h2));
		System.out.println(h1);

	}

}
