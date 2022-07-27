package com.CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Red", 1);
		hm.put("Pink", 2);
		hm.put("Blue", 1);
		hm.put("Purple", 3);
		hm.put("Green", 5);

		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println("entryset is:"+hm.entrySet());

		System.out.println("check if empty:" + hm.isEmpty());
		System.out.println("check if key present:" + hm.containsKey("Blue"));
		System.out.println("check size of hashmap:" + hm.size());
		hm.replace("Blue", 4);
		System.out.println("replace:" + hm.get("Blue"));

	


	}

}
