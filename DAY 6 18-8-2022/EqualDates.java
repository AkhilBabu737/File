package com.dateapi.java8;

import java.time.LocalDate;

public class EqualDates {
	public static void main(String args[])
	{
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(date1.getYear(), date1.getMonth(), date1.getDayOfMonth());
		
		System.out.println("Date One is:"+ date1);
		System.out.println("Date Two is:"+ date2);
		
		if (date1.equals(date2)) {
			   System.out.printf("\nBoth the dates are same!", date1, date2);
		}
			   else
				   System.out.printf("\nBoth the dates are different!", date1, date2);
			}
	}

