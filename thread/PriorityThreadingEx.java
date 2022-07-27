package com.thread;
 class Factorial implements Runnable{

	@Override
	public void run() {
		int num = 0;
		int fact =1;
		// TODO Auto-generated method stub
		for (int i = 1; i <= num; i++) {
			 fact = i;
	}
	 
 }
	class Fibbonacii implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}



public class PriorityThreadingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Factorial f = new Factorial();
     Thread t4=new Thread(f);
     t4.setName("Factorial name");
     t4.setPriority(1);
     System.out.println("Thread name:"+t4.getName());
     System.out.println("Thread priority:"+t4.getPriority());
     t4.start();
	}

}
}
