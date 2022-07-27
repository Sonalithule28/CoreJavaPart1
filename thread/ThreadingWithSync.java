package com.thread;
class First{
	synchronized public void display(String msg) {
		 System.out.println("[" +msg );
		 try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
		System.out.println("]");
	}
}
class Second extends Thread{
	String msg;
	First obj;
	Second (First fp,String str){
		obj=fp;
		msg=str;
		
	}
	public void run() {
		obj.display(msg);
	}
}

public class ThreadingWithSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First fnew = new First();
		 Second ss = new Second(fnew, "welcome");
		 ss.start();
		 Second ss1 = new Second(fnew, "to");
		 ss1.start();
		 Second ss2 = new Second(fnew, "multi-threading");
         ss2.start();
	}

}
