package com.Java.File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharReading {


	public static void main(String[] args) throws IOException  {
		int wordcount=0;
		int charcount=0;
		int linecount=0;
		FileReader fr =new FileReader("d://abc.txt");
		BufferedReader br1= new BufferedReader(fr);
		String currentLine=br1.readLine();
		while (currentLine != null) {
			linecount++;
			String[] words = currentLine.split("");
			wordcount = wordcount + words.length;
			 for (String word: words) {
				 charcount = charcount + words.length;
			 }
			 currentLine = br1.readLine();
		}
		System.out.println("No of lines:"+linecount);
		System.out.println("No of chars:"+charcount);
		System.out.println("No of words:"+wordcount);

		
	}

}
