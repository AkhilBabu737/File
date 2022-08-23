package com.dateapi.java8;

import java.time.LocalDate;
import java.util.Scanner;

public class ParticularDate {

	public static void main(String[] args) {
		
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the year: ");
			  int year = sc.nextInt();
			  System.out.println("Enter the month: ");
			  int month = sc.nextInt();
			  System.out.println("Enter the day: ");
			  int day = sc.nextInt();
			 
			  LocalDate givenDate = LocalDate.of(year, month, day);
			  
			  System.out.println("Date: "+givenDate);
		}
	   }

	}

