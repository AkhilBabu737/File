package com.student;

class Test extends Student
{
    int english;
    int maths;
    int hindi;
    
    
	public Test(String studentName, int rollNo, int english, int maths, int hindi) {
		super(studentName, rollNo);
		this.english = english;
		this.maths = maths;
		this.hindi = hindi;
	}


	void show_marks()
	{
		super.show();
	    System.out.println("subjectMarks are:"+ english+" "+ maths+" "+ hindi+" ");
	}
}