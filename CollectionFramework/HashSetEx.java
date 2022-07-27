package com.CollectionFramework;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 8 is capacity i.e maximum element we can enter, 0.50 is load factor ,after
		// that load factor it will increase capacity
		HashSet<Integer> hashSet = new HashSet<>(10, (float) 0.50);

		HashSet<Integer> hashSet1 = new HashSet<>();
		hashSet1.add(1);
		hashSet1.add(2);
		hashSet.add(50);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(40);
		hashSet.add(20);
		hashSet.add(10);
		hashSet.add(100);
		hashSet.addAll(hashSet1);
		hashSet.add(null);
		System.out.println("Values inserted in set are: " + hashSet);
	System.out.println(hashSet.isEmpty());
System.out.println(hashSet.remove(20));
	System.out.println("Values inserted in set are: " + hashSet);
		System.out.println(hashSet.size());
		System.out.println(hashSet.contains(10));
	System.out.println(hashSet.hashCode());
	hashSet.clear();
	System.out.println("Values inserted in set are: " + hashSet);
	}

}
