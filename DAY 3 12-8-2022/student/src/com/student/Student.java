package com.student;

class Student
{
	String studentName;
	int rollNo;
	
	
	public Student(String studentName, int rollNo) {
		super();
		this.studentName = studentName;
		this.rollNo = rollNo;
	}
	public void show()
	{
	   System.out.println("Rollnumber of the "+studentName+" is:"+rollNo );
	}
}
