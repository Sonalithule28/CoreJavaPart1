package com.thread;



class Table3
{      
 void printTable(int n){    
   synchronized(this){    
     for(int i=1;i<=5;i++){    
      System.out.println(n*i);    
      try{    
       Thread.sleep(400);    
      }catch(Exception e){System.out.println(e);}    
     }    
   }    
 }
}
class Thread8 extends Thread{    
Table t;    
public Thread8(Table3 t1) {
	// TODO Auto-generated constructor stub
}
void Thread2(Table t){    
this.t=t;    
}    
public void run(){    
 
.printTable (100);    
}    
}  
class MyThread1 extends Thread{    
Table t;    
MyThread1(Table t){    
this.t=t;    
}    
public MyThread1(Table3 t1) {
	// TODO Auto-generated constructor stub
}
public void run(){    
((Table3) t3).printTable(5);    
}    
    
}    

public class SyncBlockEx {
	public static void main(String args[]){    
		Table3 t1 = new Table3();  
		
		MyThread1 t11=new MyThread1(t1);    
 
		Thread8 t2=new Thread8(t1);    
	   
		t2.start();    
		}    
		}    
		


