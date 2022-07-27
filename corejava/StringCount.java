package com.corejava;
import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
	    int words=1,character=1;
	    
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter String");
	     s=sc.nextLine();
	     
	    // char ch[]=new char[s.length()];
	     for(int i=0;i<s.length()-1;i++)
	     {
	    	//char ch=s.charAt(i);
	    	//char words=s.charAt(i);
	    	//char character=s.charAt(i);
	    	 if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
	    	 {
	    		 words++;
	    	 }
	    	 else if(s.charAt(i)!=' ')
	    	 {
	    		 character++;
	    	 }
	       
	     }
	     
	     System.out.println("Words"+words);
	     System.out.println("character"+character);
	     System.out.println("space"+(words-1));
	     
		
	  




	}

}
