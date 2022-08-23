package com.student;

class Result extends Test implements Sports
{
	
	
    public Result(String studentName, int rollNo, int english, int maths, int hindi) {
		super(studentName, rollNo, english, maths, hindi);
	
	}

	public void show_sportswt()
    {
       int result = super.english+super.maths+super.hindi+sportsMarks;
        System.out.println("total marks obtained is:"+ result);
    }
}
