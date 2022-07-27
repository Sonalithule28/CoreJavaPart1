package com.thread;

public class GarbageCollectionEx {
	
	  
		 public void finalize(){
			 System.out.println("object is garbage collected");
			 }  
		 public static <TestGarbage1> void main(String args[]){  
			 GarbageCollectionEx s1=new GarbageCollectionEx();  
			 GarbageCollectionEx s2=new GarbageCollectionEx();  
		  s1=null;  
		  s2=null;  
		  System.gc();  
		 }  
		}  


