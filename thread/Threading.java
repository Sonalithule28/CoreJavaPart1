package com.thread;

public class Threading {

	public static void main(String[] args)
	{
	Thread2 b = new Thread2();
	b.start();
	synchronized(b)
	{
	try
	{
	System.out.println("Waiting for 2 to complete...");
	b.wait();
	}
	catch(InterruptedException e)
	{
	e.printStackTrace();
	}
	System.out.println("Total is: " + b.total);
	} } }
	class Thread6 extends Thread1
	{
	int total;
	@Override public void run()
	{
	synchronized(this)
	{
	for(int i=0; i<=100 ; i++)
	{
	total += i;
	}
	notify();
	}}
	public void start() {
		// TODO Auto-generated method stub
		
	}}

