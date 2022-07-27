package com.thread;

public class DaemonThread  extends Thread {
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread is working....");
		}
		else {
			System.out.println("user thred work");
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThread t1=new DaemonThread();
		DaemonThread t2=new DaemonThread();
		DaemonThread t3=new DaemonThread();
t1.setDaemon(false);
t1.start();
t2.start();
t3.start();

	}

}
