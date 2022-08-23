package System.out;

import java.util.Scanner;

public class Student {
	static String sName,course;
	static int age,rollNo;
	
	
	public Student(String sName,int age,int rollNo,String course)throws AgeNotWithinRangeException 
	{
		if(!(age>=15 && age<=21))
		{
			throw new AgeNotWithinRangeException("Age is within 15 and 21");
		}
	
		this.sName=sName;
		this.age=age;
		this.rollNo=rollNo;
		this.course=course;
	}

public static void main(String args[])throws AgeNotWithinRangeException
{
	Scanner intInput =new Scanner(System.in);
	Scanner strInput=new Scanner(System.in);
	
	System.out.println("Enter student name");
	sName=strInput.nextLine();
	
	System.out.println("Enter student age");
	age=intInput.nextInt();
	
	System.out.println("Enter student rollNo");
	rollNo=intInput.nextInt();
	
	System.out.println("Enter student course");
	course=strInput.nextLine();	
	
	try
	{
		Student student = new Student(sName,age,rollNo,course);
		System.out.println("Student created succesfully");
	}
	
	catch(AgeNotWithinRangeException E)
	{
		System.out.println("Exception caught:" + E);
	}
	
}
}

