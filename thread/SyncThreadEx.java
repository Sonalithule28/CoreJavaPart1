package com.thread;

class Factoriale1 extends Thread{
	int FactorialNumber =0;
	public Factoriale1(int fact) {
		this.FactorialNumber=fact;
		}
	
	public void run() {
		int j=findFacto(FactorialNumber);
		System.out.println("Factorial is:"+j);
		
	}
	synchronized public int findFacto(int number) {
		int i,fact=1;
		for(i=1;i<=number;i++) {
			fact=fact*i;
			
		}
		return fact;
	}
}
    class Table extends Thread{
    	int num=0;
    	public Table(int num) {
    		this.num=num;
    		
    	}
    	public void run() {
    		createTable (num);
			
	}
    	synchronized public void createTable(int number) {
		System.out.println("\n\n Table is \n\n");
		for(int i=1;i<=10;i++) {
			System.out.println(number + "*" + i + "=" + (number*i));
			}
		}
		
		
		
    }







public class SyncThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Factoriale1 f=new Factoriale1(3);
		 Thread t= new Thread(f);
		 
		 
		 Table tab=new Table(6);
		 Thread t6= new Thread(tab);
		 
		 t.start();
		 t6.start();
		

	}

}
