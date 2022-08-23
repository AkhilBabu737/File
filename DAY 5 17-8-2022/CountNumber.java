package com.filew;
import java.io.*;
public class CountNumber {

	public static void main(String[] args)throws IOException {
		String line;
		int lineCount=0;
		int wordsCount=0;
		int charCount=0;
		FileReader f = new FileReader("C:\\Users\\Akhil Babu\\eclipse-workspace\\Filewriter\\src\\com\\filew\\f.txt");
		BufferedReader br = new BufferedReader(f); 
		
		while((line = br.readLine()) != null) 
		{ 
		    String words[] = line.split(" ");  
            wordsCount = wordsCount + words.length;  
            charCount = charCount + line.length();
            lineCount=lineCount++;
        }  
		
		 System.out.println("Number of words present in given file: " + wordsCount);  
		 System.out.println("Number of lines present in given file: " + lineCount);  
		 System.out.println("Number of characters present in given file: " + charCount);  
	        br.close();  
	}
}

		
	

