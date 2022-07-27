package com.thread;

public class FinalizeEx {
	public static void main(String[] args) 
    { 
		FinalizeEx  obj = new FinalizeEx(); 
        System.out.println(obj.hashCode()); 
        obj = null; 
        // calling garbage collector  
        System.gc(); 
        System.out.println("end of garbage collection"); 

    } 
    @Override
    protected void finalize() 
    { 
        System.out.println("finalize method called"); 
    } 

}
