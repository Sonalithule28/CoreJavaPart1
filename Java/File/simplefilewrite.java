package com.Java.File;
import java.io.FileWriter;
public class simplefilewrite{

	public simplefilewrite(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
 try {
	 FileWriter fw=new FileWriter("d://abc.txt");
	 fw.write("Welcome");
	fw.close();
} catch (Exception e) { 
	System.out.println(e);
}
 System.out.println("Success");

}

	
		
	}
	

