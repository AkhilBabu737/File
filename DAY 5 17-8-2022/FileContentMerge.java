package com.filew;

import java.io.*;

public class FileContentMerge {
	public static void main(String[] args)throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\Akhil Babu\\eclipse-workspace\\Filewriter\\src\\com\\filew\\file3.txt");
		
		FileReader fReader1 = new FileReader("C:\\Users\\Akhil Babu\\eclipse-workspace\\Filewriter\\src\\com\\filew\\file1.txt");
		int i;
		while((i=fReader1.read())!=-1) 
		{
			fw.write((char)i);
		}
	
	   
	    FileReader fReader2 = new FileReader("C:\\Users\\Akhil Babu\\eclipse-workspace\\Filewriter\\src\\com\\filew\\file2.txt");
	    while((i=fReader2.read())!=-1) 
	    {
		    fw.write((char)i);
	    }
	    
	    fw.close();
	}
}

