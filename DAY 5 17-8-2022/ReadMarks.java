package com.filew;
import java.io.*;
import java.util.Scanner;
public class ReadMarks {
	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name");
		String s = sc.nextLine();
		FileReader marks = new FileReader("C:\\Users\\Akhil Babu\\eclipse-workspace\\Filewriter\\src\\com\\filew\\"+s+".txt");
		try (BufferedReader br = new BufferedReader(marks)) {
			int sum=0;
			int avg=0;
			String line;
			while((line = br.readLine()) != null) 
			{ 
			    String words[] = line.split(" "); 
			    for(int i=0;i<words.length;i++)
			    {
			    	sum=sum + Integer.parseInt(words[i]);
			    	
			    }
			    avg=(sum/(words.length));
			    System.out.println("Sum of the marks is:"+sum);
			    System.out.println("Average of the marks is:"+avg);
			    
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
