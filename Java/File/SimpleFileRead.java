package com.Java.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class SimpleFileRead {

	public static void main(String[] args)throws Exception {
		FileReader fr;
		try {
			 fr= new FileReader("d://abc.txt");
			 int i;
				while((i=fr.read())!=-1)
				{
					System.out.println((char)i);
				}
				fr.close();

				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	
		

	}

}
