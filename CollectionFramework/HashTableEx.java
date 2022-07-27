package com.CollectionFramework;

import java.util.Hashtable;

public class HashTableEx {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(2, "Anu");
		ht.put(8, "Sonu");
		ht.put(7, "Sanu");
		ht.put(6, "Janu");
		ht.put(4, "jiya");
		ht.put(1, "Sanchi");
		System.out.println("HashTable: " + ht.entrySet());
		System.out.println("check if key present:" + ht.containsKey(1));
		System.out.println("check if empty:" + ht.isEmpty());
		System.out.println("check size of Hashtable:" + ht.size());
	}
}
