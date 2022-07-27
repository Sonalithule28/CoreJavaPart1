package com.CollectionFramework;

import java.util.Stack;

public class StackOperationEx {

	public static void main(String[] args) {
		Stack<Integer> li = new Stack<>();
		System.out.println("list is empty:"+li.isEmpty());
		li.push(16);
		li.push(88);
		li.add(70);
		li.add(98);
		li.push(60);
		li.add(77);
		System.out.println("list is: " + li);
		System.out.println("pop the element:"+li.pop());
		System.out.println("pop the element:"+li.pop());
		li.push(97);
		System.out.println("list is: " + li);
		System.out.println("pop the element:"+li.pop());
		System.out.println("top of stack: " + li.peek());
		System.out.println("capacity of stack: " + li.capacity());
		System.out.println("Index of element:"+li.indexOf(88));
		System.out.println("list is: " + li);

		System.out.println("list is: " + li.search(70));

	}

}

