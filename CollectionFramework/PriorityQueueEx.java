package com.CollectionFramework;

import java.util.PriorityQueue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		PriorityQueue<String> pr = new PriorityQueue<String>();
		pr.add("Janu");
		pr.add("Sonu");
		pr.add("Anu");
		pr.add("Sanu");
		System.out.println("PriorityQueue data is: " + pr);
		System.out.println("PriorityQueue hashCode is: " + pr.hashCode());
		System.out.println("PriorityQueue peek is: " + pr.peek());
		System.out.println("PriorityQueue data is: " + pr);
		System.out.println("PriorityQueue size is: " + pr.size());

	}

}
