package com.interfacejava;

public interface Myinterface {
	default void dafaultMethod() {
		System.out.println("This is default method");
	}

	static void staticMethod(String str) {
		System.out.println("This is Static method" + str);
	}

	void simpleMethod(String str);
}
