package com.corejava;

public class StringBuilder {

	public StringBuilder(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Long startingTime = System.currentTimeMillis();
     StringBuffer sbuffer = new StringBuffer("Hello");
     for (int i=0; i<1000; i++) {
    	 sbuffer.append("java");
     }
     System.out.println("Time consumed by StringBuffer:"+ (System.currentTimeMillis()- startingTime) +"milliseconds");
     
     startingTime = System.currentTimeMillis();
     StringBuffer sbuilder = new StringBuffer("World");
     for (int i=0; i<1000; i++) {
    	 sbuilder.append("python");
    	 
     
     
	}
     System.out.println("Time consumed by StringBuilder:"+ (System.currentTimeMillis()- startingTime) +"milliseconds");
     

	}

	public void append(long i) {
		// TODO Auto-generated method stub
		
	}
}
