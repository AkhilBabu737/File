package com.student;

import java.util.Scanner;

class Main
{
    public static void main(String args [])
    {
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Enter the student Name:");
       String studentName = in.nextLine();
        System.out.println("Enter the student rollNo:");
       int rollNo = in.nextInt();
        System.out.println("Enter the marks in english:");
       int english = in.nextInt();
        System.out.println("Enter the marks obtained in maths:");
      int  maths = in.nextInt();
        System.out.println("Enter the marks in hindi:");
      int hindi = in.nextInt();
      Result s1 = new Result(studentName, rollNo,english,maths, hindi  ) ;
      Test s2 = new Test(studentName, rollNo,english,maths, hindi  ) ;
        s2.show();
        s2.show_marks();
        s1.show_sportswt();
    }
}