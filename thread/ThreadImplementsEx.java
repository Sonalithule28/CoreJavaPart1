package com.thread;



 class Multi implements Runnable{
	
	@Override
	public void run() {
		int num=6;
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
		
	}

	
}
 class Fibbo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n= 10;
		int f1=0,f2=1,f3;
		for(int i=1;i<=n;i++) {
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}
		
	}
	 
 }
 

public class ThreadImplementsEx {

	public static void main(String[] args) {
		Multi m= new  Multi();
		Thread t3 =new Thread(m);
		t3.start();
		Fibbo f=new Fibbo();
		Thread t2 =new Thread(f);
		t2.start();
	}

}
