package com.interfacejava;

public class Java8Demo implements Myinterface {
	public void simpleMethod(String str) {
		System.out.println("This is simple method"  +str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java8Demo j = new Java8Demo();
		j.simpleMethod("Sonu");
		j.dafaultMethod();
		Myinterface.staticMethod("Janu");
	}

}
