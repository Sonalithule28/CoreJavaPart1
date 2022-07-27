package com.CollectionFramework;

import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(1, "Sonu");
		tm.put(3, "Janu");
		tm.put(6, "Sam");
		tm.put(4, null);
		tm.put(2, "Champ");
		System.out.println("TreeMap: " + tm.entrySet());
		System.out.println("check if key present:" + tm.containsKey(3));
		System.out.println("check if empty:" + tm.isEmpty());
		System.out.println("check size of Treemap:" + tm.size());

}
}
