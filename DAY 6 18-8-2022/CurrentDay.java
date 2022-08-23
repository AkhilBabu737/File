package com.dateapi.java8;

import java.time.LocalDate;

public class CurrentDay {

	public static void main(String[] args) {
		
		LocalDate current = LocalDate.now();
		
		System.out.println("Current day is:"+ current.getDayOfMonth());
		System.out.println("Current month is:"+ current.getMonth());
		System.out.println("Current year is:"+ current.getYear());
	}

}
