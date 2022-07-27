package com.thread;

public class FinalizedEx2 {
	public static void main(String[] args)
	{
	FinalizedEx2 s=new FinalizedEx2();
	s=null;
	String string = new String("I am Sonali");
	
	string = null;
	
	System.gc();
	
	System.out.println("I am in Main method");
	}
	
		protected void finalize()
	{
	
	System.out.println("I am feeling that I am Overriding finalize method");
	
}
}