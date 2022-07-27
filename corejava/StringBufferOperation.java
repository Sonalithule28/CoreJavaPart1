package com.corejava;
import java.util.Scanner;

public class StringBufferOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer str = new StringBuffer("I love java");
		
		System.out.println("capacity :"+str.capacity());
		System.out.println("append :"+str.append(".i do programing"));
		
		System.out.println("length:"+str.length());
		System.out.println("reverse:"+str.reverse());
		System.out.println("replace:"+str.replace(2,4,"abc"));
		System.out.println("insert:"+str.insert(2,"get"));
		
		System.out.println("delete:"+str.delete(2,4));
		
		StringBuffer sb=new StringBuffer();  
        System.out.println(sb.capacity());  
        sb.append("DataFlair"); 
        System.out.println("length:"+sb.length());
        System.out.println(sb.capacity());
        sb.append("DataFlair is company that teaches programming!!!"); 
        System.out.println("length:"+sb.length());
        System.out.println(sb.capacity());
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());  
        sb.ensureCapacity(50);
        

		

	
	
		
	

	}

}
